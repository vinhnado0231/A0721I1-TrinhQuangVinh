package com.example.blogajax.controller;

import com.example.blogajax.model.Blog;
import com.example.blogajax.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("blog")
public class BlogController {
    static int limit = 2;
    @Autowired
    IBlogService iBlogService;

    @GetMapping("/list")
    public ResponseEntity<Iterable<Blog>> getList() {
        List<Blog> list = iBlogService.findAll();
        List<Blog> listBlogLimit = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            listBlogLimit.add(list.get(i));
        }
        return new ResponseEntity<>(listBlogLimit, HttpStatus.OK);
    }

    @GetMapping("/load")
    public ResponseEntity<String> getNewLimit() {
        List<Blog> list = iBlogService.findAll();
        if (list.size() >= limit + 2) {
            limit += 2;
        }else  if (list.size() >= limit + 1) {
            limit += 1;
        }
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping("/show")
    public ModelAndView showList() {
        List<Blog> list = iBlogService.findAll();
        List<Blog> listBlogLimit = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            listBlogLimit.add(list.get(i));
        }
        return new ModelAndView("list", "list", listBlogLimit);
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Blog blog) {
        iBlogService.save(blog);
        return new ResponseEntity<>("Ok", HttpStatus.CREATED);
    }

    @GetMapping("/search")
    public ResponseEntity<Iterable<Blog>> searchBlog(@RequestParam String search) {
        List<Blog> list = iBlogService.searchByTitle(search);
        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
    }

}
