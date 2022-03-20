package com.example.restfulblogapplication.service;

import com.example.restfulblogapplication.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void delete(int id);

    Optional<Blog> findById(int id);

    void update(Blog blog);

    Page<Blog> findBlogById(Integer id, Pageable pageable);

}
