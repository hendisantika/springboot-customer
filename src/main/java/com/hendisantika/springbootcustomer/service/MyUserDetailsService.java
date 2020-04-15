package com.hendisantika.springbootcustomer.service;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-customer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/04/20
 * Time: 06.10
 */
@Service
@Transactional
public class MyUserDetailsService implements UserDetailsService {

    // to fetch user details from the db..
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        if ("pk".equalsIgnoreCase(username)) {

            return new User("pk", "pk", Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + "User")));
        } else if ("hendisantika".equalsIgnoreCase(username)) {

            return new User("hendisantika", "admin",
                    Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + "Admin")));
        } else {
            throw new UsernameNotFoundException("no user found");
        }

    }

}
