package com.example.musicapplication.controller;

import com.example.musicapplication.model.Music;
import com.example.musicapplication.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    MusicService musicService;

    @GetMapping("")
    public ModelAndView getMusicList() {
        return new ModelAndView("list", "musics", musicService.findAll());
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("music", new Music());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView save(@ModelAttribute("music") Music music) {
        musicService.save(music);
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("music", new Music());
        return modelAndView;
    }

    @GetMapping("/{id}/edit")
    public ModelAndView showEditForm(@PathVariable long id) {
        Music music = musicService.findById(id);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("music", music);
        return modelAndView;
    }

    @PostMapping("/{id}/edit")
    public ModelAndView updateMusic(@ModelAttribute("music") Music music) {
        musicService.save(music);
        ModelAndView modelAndView = new ModelAndView("/music/edit");
        modelAndView.addObject("music", music);
        return modelAndView;
    }

    @PostMapping("/{id}/delete")
    public String deleteMusic(@ModelAttribute("music") Music music){
        musicService.remove(music.getId());
        return "redirect:musics";
    }
}

