package com.example.case_study.controller;

import com.example.case_study.model.Customer;
import com.example.case_study.model.CustomerType;
import com.example.case_study.service.customer.ICustomerService;
import com.example.case_study.service.customer.ICustomerTypeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ICustomerTypeService customerTypeService;

    @GetMapping("")
    ModelAndView showList(@PageableDefault(size = 5) Pageable pageable) {
        return new ModelAndView("customer/list", "customerList", customerService.findAll(pageable));
    }

    @GetMapping("/create")
    public String create(Pageable pageable, Model model) {
        List<CustomerType> listCustomerType = customerTypeService.findAll();
        model.addAttribute("listCustomerType", listCustomerType);
        model.addAttribute("customer", new Customer());
        return "customer/create";
    }

    @PostMapping("/create")
    public String save(@Validated @ModelAttribute Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return "customer/create";
        }
        customerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        customerService.remove(id);
        return "redirect:/customer";
    }

    @GetMapping("/edit/{id}")
   public String edit(@PathVariable int id,Model model) {
        List<CustomerType> listCustomerType = customerTypeService.findAll();
        model.addAttribute("listCustomerType", listCustomerType);
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "customer/edit";
    }

    @PostMapping("/edit")
    public String edit(@Validated @ModelAttribute Customer customer, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()) {
            return "customer/edit";
        }
        customerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping("/use-service")
    public String showListUseService(@PageableDefault(size = 5)Pageable pageable, ModelMap modelMap){
        Page<Customer> listCustomer = customerService.findAllUseService(pageable);
        modelMap.addAttribute("listCustomer", listCustomer);
        return "customer/listUseService";
    }
}
