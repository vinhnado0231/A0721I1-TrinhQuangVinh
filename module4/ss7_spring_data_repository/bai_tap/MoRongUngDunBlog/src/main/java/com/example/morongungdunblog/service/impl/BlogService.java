package com.example.morongungdunblog.service.impl;

import com.example.morongungdunblog.model.Blog;
import com.example.morongungdunblog.repository.BlogRepository;
import com.example.morongungdunblog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void delete(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public Page<Blog> findBlogById(Integer id, Pageable pageable) {
        return blogRepository.findBlogById(id, pageable);
    }

    @Override
    public Page<Blog> searchByTitle(String title, Pageable pageable) {
        return null;
    }
}
