package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @GetMapping("/translate")
    public String showIndex()
    {
        return "index";
    }
    @PostMapping("/translate")
    public String translate(@RequestParam String word,
                            Model model) {
        String[] engWords = {"class", "school", "chair", "table", "car", "telephone"};
        String[] vieWords = {"lop hoc", "truong hoc", "ghe", "ban", "xe o to", "dien thoai"};
        String result = null;
        for (int i = 0; i < engWords.length; i++) {
            if (word.equals(engWords[i])) {
                result = vieWords[i];
                break;
            }
            result = "Khong co trong thu vien";
        }
        model.addAttribute("result", result);
        return "index";
    }
}
