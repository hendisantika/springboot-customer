package com.hendisantika.springbootcustomer.repository;

import com.hendisantika.springbootcustomer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-customer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/04/20
 * Time: 06.02
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
