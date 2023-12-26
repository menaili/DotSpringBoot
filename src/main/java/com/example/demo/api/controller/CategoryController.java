package com.example.demo.api.controller;

import java.util.List;


import com.example.demo.Repository.CategoryRepository;
import com.example.demo.api.model.Category;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @GetMapping()
    public List<Category> getCategories(){
        return categoryRepository.findAll();
    }

    @PostMapping
    public Category addCategory(@RequestBody Category category) {
            System.out.println("Received category: " + category);

            return categoryRepository.save(category);
    }


    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable int id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable int id, @RequestBody Category updateCategory) {
        if (categoryRepository.existsById(id)) {
            updateCategory.setId(id);
            return categoryRepository.save(updateCategory);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable int id) {
        categoryRepository.deleteById(id);
    }
}
