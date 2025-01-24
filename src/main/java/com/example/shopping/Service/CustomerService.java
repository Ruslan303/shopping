package com.example.shopping.Service;

import com.example.shopping.Entity.Customer;

import com.example.shopping.Entity.Item;
import com.example.shopping.Repository.CustomerRepository;
import com.example.shopping.Repository.ItemRepository;
import jdk.jfr.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final ItemRepository itemRepository;


    public Customer registerCustomer(Customer customer) {
        // Username-in unikal olub olmadığını yoxlayırıq
        Optional<Customer> existingCustomer = customerRepository.findByUsername(customer.getUsername());
        if (existingCustomer.isPresent()) {
            throw new IllegalStateException("Username already exists!");
        }
        return customerRepository.save(customer);
    }


    public Customer login(String username, String password) {
        Customer customer = customerRepository.findByUsername(username)
                .orElseThrow(() -> new IllegalArgumentException("Invalid username or password!"));

        if (!customer.getPassword().equals(password)) {
            throw new IllegalArgumentException("Invalid username or password!");
        }
        return customer;
    }


    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }


    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);


    }
}
