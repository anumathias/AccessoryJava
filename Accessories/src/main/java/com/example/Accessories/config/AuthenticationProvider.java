package com.example.Accessories.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.Accessories.model.login;
import com.example.Accessories.model.users;
import com.example.Accessories.repository.LoginRepository;
import com.example.Accessories.repository.usersrepository;


@Component
public class AuthenticationProvider implements org.springframework.security.authentication.AuthenticationProvider {

	@Autowired
	private  usersrepository usersRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		{
			String username = authentication.getName();
	        String password = authentication.getCredentials().toString();
	        List<users> user = (List<users>) usersRepository.findByEmail(username);
	        if (user.size() > 0) {
	            if (passwordEncoder.matches(password, user.get(0).getPassword())) {
	                List<GrantedAuthority> authorities = new ArrayList<>();
	                authorities.add(new SimpleGrantedAuthority(user.get(0).getFirstname()));
	                return new UsernamePasswordAuthenticationToken(username,password, authorities);
	            } else {
	                throw new BadCredentialsException("Invalid password!");
	            }
	        }else {
	            throw new BadCredentialsException("No user registered with this details!");
	        }
		}
		}
	@Override
	public boolean supports(Class<?> authentication) {
		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	}

}
