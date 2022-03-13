package com.example.ungdungblog.service;

import com.example.ungdungblog.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void delete(int id);

    Blog findById(int id);

    void update(Blog blog);
}
