package com.hendisantika.springbootcustomer.controller;

import com.hendisantika.springbootcustomer.config.JwtTokenUtil;
import com.hendisantika.springbootcustomer.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-customer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/04/20
 * Time: 05.59
 */
@RestController
//@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)

public class JwtAuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private MyUserDetailsService userDetailsService;
}
