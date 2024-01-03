package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.api.model.Category;
import com.example.demo.apiError.NotFoundExeption;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(int id) {
        try {
         return categoryRepository.findById(id).get();   
        } catch (Exception e) {
            // TODO: handle exception
            throw new NotFoundExeption(String.format("No category with this id: [%s]", id));
        }
    }

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    public void deleteCategoryById(Integer id) {
        categoryRepository.deleteById(id);
    }

    public Category updateCategory(int id, Category updateCategory) {
        if (categoryRepository.existsById(id)) {
            updateCategory.setId(id);
            return categoryRepository.save(updateCategory);
        }
        return null;
    }
    
}
