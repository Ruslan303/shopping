package com.example.shopping.Controller;

import com.example.shopping.Entity.Customer;
import com.example.shopping.Service.CustomerService;
import jdk.jfr.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;


    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }


    @PostMapping("cerateCustomer")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);

    }
}

