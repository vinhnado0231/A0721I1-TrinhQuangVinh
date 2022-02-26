package controllers;

import model.EmailSetting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {
    @GetMapping("/setting")
    public String showHomePage(Model model){
        model.addAttribute("setting", new EmailSetting());
        return "index";
    }
    @PostMapping("/result")
    public String result(@ModelAttribute("setting") EmailSetting emailSetting ,Model model ){
//        model.addAttribute("setting", emailSetting);
        return "result";
    }
}
