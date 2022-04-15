package com.example.demo.controller;

import com.example.demo.model.Question;
import com.example.demo.model.QuestionType;
import com.example.demo.service.IQuestionService;
import com.example.demo.service.IQuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private IQuestionService questionService;
    @Autowired
    private IQuestionTypeService questionTypeService;

    @GetMapping("")
    ModelAndView showList(@PageableDefault(size = 5) Pageable pageable) {
        return new ModelAndView("list", "listQuestion", questionService.findAll(pageable));
    }

    @GetMapping("/create")
    String create(ModelMap modelMap) {
        modelMap.addAttribute("question1", new Question());
        List<QuestionType> questionTypeList = questionTypeService.findAll();
        modelMap.addAttribute("questionTypeList", questionTypeList);
        return "create";
    }

    @PostMapping("/create")
    String create(@Validated @ModelAttribute("question1") Question question1, BindingResult bindingResult, ModelMap modelMap) {
        if (bindingResult.hasFieldErrors()) {
            List<QuestionType> questionTypeList = questionTypeService.findAll();
            modelMap.addAttribute("questionTypeList", questionTypeList);
            return "create";
        }
        question1.setDateCreate(LocalDate.now());
        questionService.save(question1);
        return "redirect:/question";
    }

    @GetMapping("/delete/{id}")
    String delete(@PathVariable int id) {
        questionService.remove(id);
        return "redirect:/question";
    }

    @GetMapping("/edit/{id}")
    String edit(@PathVariable int id, ModelMap modelMap) {
        Question question = questionService.findById(id);
        List<QuestionType> questionTypeList = questionTypeService.findAll();
        modelMap.addAttribute("question", question);
        modelMap.addAttribute("questionTypeList", questionTypeList);
        return "edit";
    }

    @PostMapping("/edit")
    String edit(@Validated @ModelAttribute Question question, BindingResult bindingResult, ModelMap modelMap) {
        if (bindingResult.hasFieldErrors()) {
            List<QuestionType> questionTypeList = questionTypeService.findAll();
            modelMap.addAttribute("questionTypeList", questionTypeList);
            return "edit";
        }
        questionService.save(question);
        return "redirect:/question";
    }

//    @PostMapping("/search")
//    ModelAndView search(@RequestParam String title, Model model) {
//
//        model.addAttribute(Lis)
//    }
}
