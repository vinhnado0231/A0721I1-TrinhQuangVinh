package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class ConvertController {
    @GetMapping("/convert")
    public String showForm() {
        return "index";
    }

    @PostMapping("/convert")
    public String submit(@RequestParam String usd,@RequestParam String rate, Model model) {
        float result = Float.parseFloat(usd)*Float.parseFloat(rate);
        model.addAttribute("result", result);
        return "index";
    }
}
