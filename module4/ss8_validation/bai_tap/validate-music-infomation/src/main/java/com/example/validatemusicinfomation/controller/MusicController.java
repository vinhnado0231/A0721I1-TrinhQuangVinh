package com.example.validatemusicinfomation.controller;

import com.example.validatemusicinfomation.model.Music;
import com.example.validatemusicinfomation.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MusicController {
    @Autowired
    private IMusicService iMusicService;

    @GetMapping("/index")
    public String showIndex(Model model) {
        List<Music> list = iMusicService.findAll();
        model.addAttribute("list", list);
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("music", new Music());
        return "create";
    }

    @PostMapping("/create")
    public String save(@Validated @ModelAttribute(name = "music") Music music, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return "create";
        }
        iMusicService.save(music);
        return "redirect:/index";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        Music music = iMusicService.findById(id);
        model.addAttribute("music", music);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@Validated @ModelAttribute(name = "music") Music music, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return "edit";
        }
        iMusicService.save(music);
        return "redirect:/index";
    }
}
