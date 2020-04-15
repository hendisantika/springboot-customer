package com.hendisantika.springbootcustomer.service;

import com.hendisantika.springbootcustomer.model.User;
import com.hendisantika.springbootcustomer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-customer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/04/20
 * Time: 06.12
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void create(User user) {
        userRepository.save(user);
    }
}
