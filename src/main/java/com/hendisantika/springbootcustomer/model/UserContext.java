package com.hendisantika.springbootcustomer.model;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-customer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/04/20
 * Time: 06.01
 */
public class UserContext {
    public static ThreadLocal<String> uc = new ThreadLocal<String>();


    public static ThreadLocal<String> getUserContext() {

        return uc;
    }

    public static void clearUserContext() {

        uc.remove();
    }
}
