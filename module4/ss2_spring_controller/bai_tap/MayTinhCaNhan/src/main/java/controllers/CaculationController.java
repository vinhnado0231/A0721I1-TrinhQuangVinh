package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculationController {
    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }

    @PostMapping("/caculation")
    public String calculate(@RequestParam() double num1,
                            @RequestParam() double num2,
                            @RequestParam() String calc,
                            ModelMap model) {

        double result = 0;

        switch (calc) {
            case "Addition(+)":
                result = num1 + num2;
                break;
            case "Subtraction(-)":
                result = num1 - num2;
                break;
            case "Multiplication(X)":
                result = num1 * num2;
                break;
            case "Division(/)":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    model.addAttribute("error", "Input error");
                }
                break;
        }

        model.addAttribute("result", result);
        return "index";
    }
}