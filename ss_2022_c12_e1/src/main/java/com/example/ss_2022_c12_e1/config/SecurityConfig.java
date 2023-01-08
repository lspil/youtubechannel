package com.example.ss_2022_c12_e1.config;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.source.ImmutableJWKSet;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.oidc.OidcScopes;
import org.springframework.security.oauth2.server.authorization.authentication.OAuth2AuthorizationCodeRequestAuthenticationProvider;
import org.springframework.security.oauth2.server.authorization.client.InMemoryRegisteredClientRepository;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
import org.springframework.security.oauth2.server.authorization.config.annotation.web.configuration.OAuth2AuthorizationServerConfiguration;
import org.springframework.security.oauth2.server.authorization.config.annotation.web.configurers.OAuth2AuthorizationServerConfigurer;
import org.springframework.security.oauth2.server.authorization.settings.AuthorizationServerSettings;
import org.springframework.security.oauth2.server.authorization.settings.OAuth2TokenFormat;
import org.springframework.security.oauth2.server.authorization.settings.TokenSettings;
import org.springframework.security.oauth2.server.authorization.token.JwtEncodingContext;
import org.springframework.security.oauth2.server.authorization.token.OAuth2TokenCustomizer;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.time.Duration;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

@Configuration
public class SecurityConfig {

  // http://localhost:8080/oauth2/authorize?response_type=code&client_id=client&scope=openid&redirect_uri=https://springone.io/authorized&code_challenge=QYPAZ5NU8yvtlQ9erXrUYR-T5AGCjCF47vN-KsaI2A8&code_challenge_method=S256
  // http://localhost:8080/oauth2/token?client_id=client&redirect_uri=https://springone.io/authorized&grant_type=authorization_code&code=dWlJMGpGlUAPz0sRU1y8suXDyWejo0_B4-WrLP-ks5kSlcdvlGG-u1OxOORvvpm7IMJaC_lMqzTX2Oh6AKHGOb2J4-Hp6PVPvGjLeUQMnWzz6h3Xyy1D0S6czbiTeU8f&code_verifier=qPsH306-ZDDaOE8DFzVn05TkN3ZZoVmI_6x4LsVglQI

  @Bean
  @Order(1)
  public SecurityFilterChain asSecurityFilterChain(HttpSecurity http) throws Exception {
    OAuth2AuthorizationServerConfiguration.applyDefaultSecurity(http);

    http.getConfigurer(OAuth2AuthorizationServerConfigurer.class)
        .authorizationEndpoint(
            a -> a.authenticationProviders(getAuthorizationEndpointProviders())
        )
        .oidc(Customizer.withDefaults());

    http.exceptionHandling(
        e -> e.authenticationEntryPoint(
            new LoginUrlAuthenticationEntryPoint("/login")
        )
    );

    return http.build();
  }

  private Consumer<List<AuthenticationProvider>> getAuthorizationEndpointProviders() {
    return providers -> {
      for (AuthenticationProvider p : providers) {
        if (p instanceof OAuth2AuthorizationCodeRequestAuthenticationProvider x) {
         x.setAuthenticationValidator(new CustomRedirectUriValidator());
        }
      }
    };
  }

  @Bean
  @Order(2)
  public SecurityFilterChain appSecurityFilterChain(HttpSecurity http) throws Exception {
    http.formLogin()
        .and()
        .authorizeHttpRequests().anyRequest().authenticated();

    return http.build();
  }

  @Bean
  public UserDetailsService userDetailsService() {
    var u1 = User.withUsername("user")
        .password("password")
        .authorities("read")
        .build();

    return new InMemoryUserDetailsManager(u1);
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return NoOpPasswordEncoder.getInstance();
  }

  @Bean
  public RegisteredClientRepository registeredClientRepository() {
    RegisteredClient r1 = RegisteredClient.withId(UUID.randomUUID().toString())
        .clientId("client")
        .clientSecret("secret")
        .clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
        .scope(OidcScopes.OPENID)
        .scope(OidcScopes.PROFILE)
        .redirectUri("https://springone.io/authorized")
        .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
        .authorizationGrantType(AuthorizationGrantType.REFRESH_TOKEN)
        .authorizationGrantType(AuthorizationGrantType.CLIENT_CREDENTIALS)
        .tokenSettings(
            TokenSettings.builder()
                .accessTokenFormat(OAuth2TokenFormat.REFERENCE)
                .accessTokenTimeToLive(Duration.ofSeconds(900))
                .build()
        )
        .build();

    return new InMemoryRegisteredClientRepository(r1);
  }

  @Bean
  public AuthorizationServerSettings authorizationServerSettings() {
    return AuthorizationServerSettings.builder()
        .build();
  }

  @Bean
  public JWKSource<SecurityContext> jwkSource() throws Exception {
    KeyPairGenerator kg = KeyPairGenerator.getInstance("RSA");
    kg.initialize(2048);
    KeyPair kp = kg.generateKeyPair();

    RSAPublicKey publicKey = (RSAPublicKey) kp.getPublic();
    RSAPrivateKey privateKey = (RSAPrivateKey) kp.getPrivate();

    RSAKey key = new RSAKey.Builder(publicKey)
        .privateKey(privateKey)
        .keyID(UUID.randomUUID().toString())
        .build();

    JWKSet set = new JWKSet(key);
    return new ImmutableJWKSet(set);
  }

  @Bean
  public OAuth2TokenCustomizer<JwtEncodingContext> oAuth2TokenCustomizer() {
    return  context -> {
      context.getClaims().claim("test", "test");
    };
  }

}
