package com.example.case_study.controller;

import com.example.case_study.model.RentType;
import com.example.case_study.model.Service;
import com.example.case_study.model.ServiceType;
import com.example.case_study.service.service.IRentTypeService;
import com.example.case_study.service.service.IServiceService;
import com.example.case_study.service.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private IRentTypeService rentTypeService;
    @Autowired
    private IServiceTypeService serviceTypeService;
    @Autowired
    private IServiceService serviceService;

    @GetMapping("")
    public String showList(@PageableDefault(size = 5) Pageable pageable, Model model) {
        Page<Service> listService = serviceService.findAll(pageable);
        model.addAttribute("listService", listService);
        return "service/list";
    }

    @GetMapping("/create")
    public String create(ModelMap modelMap) {
        List<RentType> list = rentTypeService.findAll();
        List<ServiceType> serviceTypeList = serviceTypeService.findAll();
        modelMap.addAttribute("listRentType", list);
        modelMap.addAttribute("listServiceType", serviceTypeList);
        Service service =new Service();
        modelMap.addAttribute("service", service);
        return "service/create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Service service) {
        serviceService.save(service);
        return "redirect:/service";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        serviceService.remove(id);
        return "redirect:/service";
    }
}