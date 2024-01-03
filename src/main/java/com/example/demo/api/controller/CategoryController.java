package com.example.demo.api.controller;

import java.util.List;


import com.example.demo.api.model.Category;
import com.example.demo.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    //private final CategoryRepository categoryRepository;
    @Autowired
    private CategoryService categoryService;


    @GetMapping()
    public List<Category> getCategories(){
        return categoryService.getAllCategories();
    }

    @PostMapping
    public Category addCategory(@RequestBody Category category) {
            System.out.println("Received category: " + category);

            return categoryService.addCategory(category);
    }


    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable int id) {
        return categoryService.getCategoryById(id);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable int id, @RequestBody Category updateCategory) {
        return categoryService.updateCategory(id, updateCategory);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable int id) {
        categoryService.deleteCategoryById(id);
    }
}
