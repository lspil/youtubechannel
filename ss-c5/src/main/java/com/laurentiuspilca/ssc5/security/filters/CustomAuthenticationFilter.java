package com.laurentiuspilca.ssc5.security.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.laurentiuspilca.ssc5.security.authentication.CustomAuthentication;

//@Component
//public class CustomAuthenticationFilter implements Filter {
//	
//	@Autowired
//	private AuthenticationManager manager;
//
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		
//		var httpRequest = (HttpServletRequest) request;
//		var httpResponse = (HttpServletResponse) response;
//		String authorization = httpRequest.getHeader("Authorization");
//		
//		// now implement Authentication
//		var a = new CustomAuthentication(authorization, null);
//		
//		try {
//			
//			Authentication result = manager.authenticate(a);
//			
//			if (result.isAuthenticated()) {								// not necessary, but be cautious
//				SecurityContextHolder.getContext().setAuthentication(result);
//				chain.doFilter(request, response);			
//			} else {
//				httpResponse.setStatus(HttpServletResponse.SC_FORBIDDEN);
//			}
//		} catch ( AuthenticationException e) {
//			httpResponse.setStatus(HttpServletResponse.SC_FORBIDDEN);
//		}
//		
//	}
//}

@Component
public class CustomAuthenticationFilter extends OncePerRequestFilter {

    @Autowired
    private AuthenticationManager manager;

    @Override
    public void doFilterInternal(HttpServletRequest request,
                                 HttpServletResponse response,
                                 FilterChain chain) throws IOException, ServletException {
        String authorization = request.getHeader("Authorization");

        var a = new CustomAuthentication(authorization, null);

        try {
            Authentication result = manager.authenticate(a);

            if (result.isAuthenticated()) {
                SecurityContextHolder.getContext().setAuthentication(result);
                chain.doFilter(request, response);
            } else {
                response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            }
        } catch (AuthenticationException e) {
            response.setStatus(HttpServletResponse.SC_EXPECTATION_FAILED);
        }
    }
}
