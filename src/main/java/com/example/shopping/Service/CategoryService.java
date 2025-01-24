package com.example.shopping.Service;

import com.example.shopping.Repository.CategoryRepository;
import jdk.jfr.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;


    public List<Category> getAllCategories() {return categoryRepository.findAll();
    }


    public Category createCategory(Category category) {return categoryRepository.save(category);

    }





}