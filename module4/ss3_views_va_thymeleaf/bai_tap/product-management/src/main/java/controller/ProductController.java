package controller;

import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.IProductService;
import service.ProductService;

import java.util.List;



@Controller
@RequestMapping("/product")
public class ProductController {
    private final IProductService productService = new ProductService();

    @GetMapping("")
    public String showHomePage(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/create")
    public String save(Product product) {
        productService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/edit";
    }

    @PostMapping("/edit")
    public String update(Product product) {
        productService.update(product.getId(), product);
        return "redirect:/product";
    }


    @GetMapping("/{id}/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        productService.remove(product.getId());
        return "redirect:/product";
    }


    @PostMapping("/search")
    public String search(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("product", productService.findByName(name));
        return "/list";
    }
}
