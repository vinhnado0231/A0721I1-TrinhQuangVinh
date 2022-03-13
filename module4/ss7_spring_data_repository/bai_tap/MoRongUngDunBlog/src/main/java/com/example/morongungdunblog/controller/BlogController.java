package com.example.morongungdunblog.controller;

import com.example.morongungdunblog.model.Blog;
import com.example.morongungdunblog.model.Category;
import com.example.morongungdunblog.service.IBlogService;
import com.example.morongungdunblog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/blog")
    public String getIndex(ModelMap modelMap) {
        List<Blog> blogs = iBlogService.findAll();
        modelMap.addAttribute("blogs", blogs);
        return "list";
    }

    @GetMapping("/create")
    public String create(ModelMap modelMap) {
        modelMap.addAttribute("blog", new Blog());
        List<Category> categories = iCategoryService.findAll();
        modelMap.addAttribute("categories", categories);
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog) {
        iBlogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable Integer id, ModelMap modelMap) {
        List<Category> categories = iCategoryService.findAll();
        modelMap.addAttribute("categories", categories);
        Blog blog = iBlogService.findById(id);
        modelMap.addAttribute("blog", blog);
        return "view";
    }

    @GetMapping("edit/{id}")
    public String update(@PathVariable Integer id, ModelMap modelMap) {
        Blog blog = iBlogService.findById(id);
        modelMap.addAttribute("blog", blog);
        List<Category> categories = iCategoryService.findAll();
        modelMap.addAttribute("categories", categories);
        return "edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute("blog") Blog blog){
        iBlogService.update(blog);
        return "redirect:/blog";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        iBlogService.delete(id);
        return "redirect:/blog";
    }
}