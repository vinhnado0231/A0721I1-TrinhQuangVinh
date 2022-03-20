package com.example.restfulblogapplication.service;


import com.example.restfulblogapplication.model.Blog;
import com.example.restfulblogapplication.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    Page<Category> findAll(Pageable pageable);

    void save(Category category);

    void delete(int id);

    Category findById(int id);

    List<Blog> findAllBlogById(int id);
}
