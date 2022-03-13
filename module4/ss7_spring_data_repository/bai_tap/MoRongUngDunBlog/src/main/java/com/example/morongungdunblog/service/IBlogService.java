package com.example.morongungdunblog.service;

import com.example.morongungdunblog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void delete(int id);

    Blog findById(int id);

    void update(Blog blog);

    Page<Blog> findBlogById(Integer id, Pageable pageable);

    Page<Blog> searchByTitle(String title, Pageable pageable);
}
