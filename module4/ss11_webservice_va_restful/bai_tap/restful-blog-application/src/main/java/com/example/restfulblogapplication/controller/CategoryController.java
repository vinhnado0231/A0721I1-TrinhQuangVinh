package com.example.restfulblogapplication.controller;

import com.example.restfulblogapplication.model.Blog;
import com.example.restfulblogapplication.model.Category;
import com.example.restfulblogapplication.service.IBlogService;
import com.example.restfulblogapplication.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/category")
@RestController
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;
    @Autowired
    private IBlogService iBlogService;

    @GetMapping
    public ResponseEntity<Iterable<Category>> showAllCategory() {
        List<Category> list = (List<Category>) iCategoryService.findAll();
        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Iterable<Blog>> showBlogInCategory(@PathVariable int id) {
        List<Blog> list = iCategoryService.findById(id).getBlogs();
        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
    }
}