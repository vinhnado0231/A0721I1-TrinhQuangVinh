package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class SpiceController {
    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }

    @PostMapping(value = "/save")
    public String save(@RequestParam("condiment") String[] condiments, ModelMap modelMap) {
        String result = "";
        for (int i = 0; i < condiments.length; i++) {
            result += condiments[i] + " ";
        }
        modelMap.addAttribute("result", result);
        return "index";
    }
}
