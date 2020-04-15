package com.hendisantika.springbootcustomer.service;

import com.hendisantika.springbootcustomer.model.Customer;
import com.hendisantika.springbootcustomer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-customer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/04/20
 * Time: 06.08
 */
@Service
@Transactional
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public void create(Customer customer) {
        customerRepository.save(customer);
    }

    public List<Customer> getCustomer() {

        List<Customer> customers = customerRepository.findAll();
        customers.forEach(customer -> System.out.println(customer.getName()));

        return customers;
    }

    public Optional<Customer> findCustomerById(Integer id) {

        return customerRepository.findById(id);
    }

    public Customer update(Customer customer, Integer id) {

        return customerRepository.save(customer);
    }

    public void deleteById(Integer id) {

        customerRepository.deleteById(id);
    }
}
