package com.restAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.restAPI.entity.Category;
import com.restAPI.repository.CategoryRepository;

@Service
public class CategoryService
{

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories(int page) {
        return categoryRepository.findAll(PageRequest.of(page, 10)).getContent();
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    public Category updateCategory(Long id, Category category) {
        category.setId(id);
        return categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}