package com.example.ssc16.security;

import com.example.ssc16.entities.Client;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SecurityClient implements ClientDetails {

    private final Client client;

    public SecurityClient(Client client) {
        this.client = client;
    }

    @Override
    public String getClientId() {
        return client.getClientId();
    }

    @Override
    public boolean isSecretRequired() {
        return true;
    }

    @Override
    public String getClientSecret() {
        return client.getSecret();
    }

    @Override
    public boolean isScoped() {
        return true;
    }

    @Override
    public Set<String> getResourceIds() {
        return null;
    }

    @Override
    public Set<String> getScope() {
        return Set.of(client.getScope());
    }

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        return List.of(() -> client.getScope());
    }

    @Override
    public Set<String> getAuthorizedGrantTypes() {
        return Set.of(client.getGrantType());
    }

    @Override
    public Set<String> getRegisteredRedirectUri() {
        return null;
    }

    @Override
    public Integer getAccessTokenValiditySeconds() {
        return null;
    }

    @Override
    public Integer getRefreshTokenValiditySeconds() {
        return null;
    }

    @Override
    public boolean isAutoApprove(String s) {
        return false;
    }

    @Override
    public Map<String, Object> getAdditionalInformation() {
        return null;
    }
}
