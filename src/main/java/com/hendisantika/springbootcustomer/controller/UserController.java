package com.hendisantika.springbootcustomer.controller;

import com.hendisantika.springbootcustomer.model.User;
import com.hendisantika.springbootcustomer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-customer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/04/20
 * Time: 05.58
 */
@RestController
//@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/register")
    public void createCustomer(@RequestBody User user) {
        userService.create(user);
    }

}