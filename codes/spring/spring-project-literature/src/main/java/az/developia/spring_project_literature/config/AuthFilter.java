package az.developia.spring_project_literature.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import az.developia.spring_project_literature.util.JwtUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class AuthFilter extends OncePerRequestFilter {

	@Autowired
 	private JwtUtil jwtUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {

        String authHeader = request.getHeader("Authorization");
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            chain.doFilter(request, response);
            return;
        }

        String token = authHeader.substring(7);
        String username = jwtUtil.extractUsername(token);

        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
        	
        	Map<String,Object> claims = jwtUtil.extractClaims(token);
//			List<String> authorities = (List<String>) claims.get("authorities");
        	
        	Object object = claims.get("authorities");
        	List<String> authorities = new ArrayList<String>();
        	if (object instanceof List) {
				authorities = (List<String>) object;
			}else if(object instanceof String[]) {
				authorities = Arrays.asList((String[]) object);
			}else if(object instanceof String) {
				authorities = Arrays.asList((String) object);
			}
        	
        	List<SimpleGrantedAuthority> grantedAuthority = authorities.stream()
        			.map(SimpleGrantedAuthority::new )
        			.collect(Collectors.toList());
        	
            User userDetails = new User(username, "",grantedAuthority);
            UsernamePasswordAuthenticationToken authToken =
                    new UsernamePasswordAuthenticationToken(userDetails, null, grantedAuthority);
            authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

            SecurityContextHolder.getContext().setAuthentication(authToken);
        }

        chain.doFilter(request, response);
    }
}
