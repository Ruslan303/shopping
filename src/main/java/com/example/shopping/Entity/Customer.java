package com.example.shopping.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private Date registeredAt;
    private Double balance = 500.0;
    private String address;
}

