package controllers;

import model.Declaration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DeclarationController {
    @GetMapping("/")
    public String showIndex(Model model){
        Declaration declare = new Declaration();
        model.addAttribute("declare", declare);
        return "index";
    }
    @PostMapping("/result")
    public String showResult(@ModelAttribute(name = "declare") Declaration declare){
        return "result";
    }
}
