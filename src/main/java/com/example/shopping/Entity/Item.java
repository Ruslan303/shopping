package com.example.shopping.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Table(name = "Item")
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY) // Bir item yalnız bir category-ə aid ola bilər
    @JoinColumn(name = "category_id") // Foreign key olaraq category_id
     Category category;  // Category ilə əlaqə

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="customer_id")
     Customer customer;


     String name;
     String brand;
     String categoryName;
     Integer stockCount;
     Double price;
     Double discountPrice; // Nullable
     Integer discountPercentage; // Nullable
     String imageStaticUrl;
}
