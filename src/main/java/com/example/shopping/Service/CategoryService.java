package com.example.shopping.Service;

import com.example.shopping.Entity.Category;
import com.example.shopping.Repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;


    public List<Category> getAllCategories() {return categoryRepository.findAll();
    }


    public Category createCategory(Category category) {return categoryRepository.save(category);

    }





}