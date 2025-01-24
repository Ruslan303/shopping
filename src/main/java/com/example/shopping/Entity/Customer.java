package com.example.shopping.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
@Table(name = "Customer")
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToMany(mappedBy = "customer")
    List<Item> items;



     String name;
     String surname;
     String username; // Login üçün
     String password; // Login üçün
     LocalDateTime registeredAt = LocalDateTime.now();
     Double balance = 500.0;
     String address;



}
