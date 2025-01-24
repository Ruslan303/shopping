package com.example.shopping.Controller;


import com.example.shopping.Entity.Category;  // Düzgün Category sinifi
import com.example.shopping.Service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {


    private final CategoryService categoryService;

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping("crateCategory")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);


    }
}