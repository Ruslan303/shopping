package com.example.shopping.Entity;

import jakarta.persistence.*;

;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String brand;
    private Integer stockCount;
    private Double price;
    private Double discountPrice;
    private Integer discountPercent;
    private String imageStaticUrl;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    // Getters and Setters
}
