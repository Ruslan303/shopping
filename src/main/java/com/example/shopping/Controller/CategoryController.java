package com.example.shopping.Controller;

import com.example.shopping.Service.CategoryService;

import jdk.jfr.Category;
//import kk.shoppp.Service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private CategoryService categoryService;

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping("cerateCategory")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);


    }
}