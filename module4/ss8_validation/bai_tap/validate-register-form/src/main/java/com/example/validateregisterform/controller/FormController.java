package com.example.validateregisterform.controller;

import com.example.validateregisterform.model.User;
import com.example.validateregisterform.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/validate")
public class FormController {

    @Autowired
    IUserService iUserService;

    @GetMapping("")
    ModelAndView showIndex() {
        return new ModelAndView("index", "user", new User());
    }

    @PostMapping("")
    ModelAndView showResult(@Validated @ModelAttribute("user") User user, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return new ModelAndView("index");
        } else {
            iUserService.save(user);
            ModelAndView modelAndView = new ModelAndView("result");
            return modelAndView;
        }

    }
}
