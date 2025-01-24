package com.example.shopping.Controller;

import com.example.shopping.Entity.Customer;
import com.example.shopping.Service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class AuthenticationController {

    private CustomerService customerService;

    @PostMapping("/register")
    public Customer registerCustomer(@RequestBody Customer customer) {
        return customerService.registerCustomer(customer);
    }

    @PostMapping("/login")
    public String login(@RequestBody String username, @RequestBody String password) {
        customerService.login(username, password);
        return "Login successful!";
    }

}
