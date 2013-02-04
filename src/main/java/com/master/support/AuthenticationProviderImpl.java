package com.master.support;

import com.master.mybatis.dao.AuthoritiesMapper;
import com.master.mybatis.dao.UsersMapper;
import com.master.mybatis.model.Authorities;
import com.master.mybatis.model.AuthoritiesExample;
import com.master.mybatis.model.Users;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;

import java.util.ArrayList;
import java.util.List;

public class AuthenticationProviderImpl implements AuthenticationProvider {

    private static final String BAD_CREDENTIALS = "Wrong username or password";

    private static final Logger LOGGER = Logger.getLogger(AuthenticationProviderImpl.class);

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private AuthoritiesMapper authoritiesMapper;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        LOGGER.debug(String.format("Attempting to log in with username [%s] and password [%s]",
                authentication.getPrincipal(), authentication.getCredentials()));

        if(authentication.getPrincipal() == null || authentication.getCredentials() == null){
            throw new BadCredentialsException(BAD_CREDENTIALS);
        }

        Users user = usersMapper.selectByPrimaryKey(authentication.getPrincipal().toString());

        if(user == null) {
            throw new BadCredentialsException(BAD_CREDENTIALS);
        }

        List<Authorities> authorities = authoritiesMapper.selectByExample(getAuthoritiesExample(user.getUsername()));
        List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        for(Authorities auth: authorities ){
            grantedAuthorities.add(new GrantedAuthorityImpl(auth.getAuthority().toString()));
        }

        if(user.getPassword().equals(authentication.getCredentials())){
            return new UsernamePasswordAuthenticationToken(authentication.getName(), authentication.getCredentials(),
                    grantedAuthorities);
        }

        throw new BadCredentialsException(BAD_CREDENTIALS);
    }

    @Override
    public boolean supports(Class<? extends Object> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }

    private AuthoritiesExample getAuthoritiesExample(String username) {
        AuthoritiesExample example = new AuthoritiesExample();
        example.createCriteria().andUsernameEqualTo(username);
        return example;
    }
}
