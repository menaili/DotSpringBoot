package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.CategoryService;

@SpringBootTest
public class CategoryTests {
    
    private final CategoryService categoryService = new CategoryService();

    

    @Test
    public void GetAllCategoriesTest() {
        
    }
}
