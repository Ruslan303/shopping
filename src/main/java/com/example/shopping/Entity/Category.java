package com.example.shopping.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="Category")
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @OneToMany(mappedBy = "category")
     List<Item> items;
}
