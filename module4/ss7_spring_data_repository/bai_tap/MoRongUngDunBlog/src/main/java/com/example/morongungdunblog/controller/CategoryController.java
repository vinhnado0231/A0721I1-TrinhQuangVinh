package com.example.morongungdunblog.controller;

import com.example.morongungdunblog.model.Blog;
import com.example.morongungdunblog.model.Category;
import com.example.morongungdunblog.service.IBlogService;
import com.example.morongungdunblog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/category")
@Controller
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("")
    public String showIndex(@PageableDefault(size = 3) Pageable pageable, ModelMap modelMap) {
        Page<Category> categories = iCategoryService.findAll(pageable);
        modelMap.addAttribute("categories", categories);
        return "category/list";
    }

    @GetMapping("/create")
    public String create(ModelMap modelMap) {
        modelMap.addAttribute("category", new Category());
        return "category/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Category category) {
        iCategoryService.save(category);
        return "redirect:/category";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        iCategoryService.delete(id);
        return "redirect:/category";
    }

    @GetMapping("/view/{id}")
    public String view(@PageableDefault(size = 3) Pageable pageable, @PathVariable Integer id, ModelMap modelMap) {
        Page<Blog> blogs = iBlogService.findBlogById(id, pageable);
        modelMap.addAttribute("blogs", blogs);
        return "list";
    }

    @GetMapping("/search")
    public String search(@PageableDefault(size = 3) Pageable pageable, @RequestParam String title, ModelMap modelMap) {
        Page<Blog> blogs = iBlogService.searchByTitle(title, pageable);
        modelMap.addAttribute("blogs", blogs);
        return "list";
    }
}