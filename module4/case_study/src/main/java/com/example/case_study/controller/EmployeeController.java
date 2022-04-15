package com.example.case_study.controller;

import com.example.case_study.model.Division;
import com.example.case_study.model.EducationDegree;
import com.example.case_study.model.Employee;
import com.example.case_study.model.Position;
import com.example.case_study.service.employee.IDivisionService;
import com.example.case_study.service.employee.IEducationDegreeService;
import com.example.case_study.service.employee.IEmployeeService;
import com.example.case_study.service.employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IPositionService positionService;

    @Autowired
    private IDivisionService divisionService;

    @Autowired
    private IEducationDegreeService educationService;

    @GetMapping("")
    public String showList(@PageableDefault(size = 7) Pageable pageable, ModelMap modelMap) {
        Page<Employee> employeeList = employeeService.findAll(pageable);
        modelMap.addAttribute("listEmployee", employeeList);
        return "employee/list";
    }

    @GetMapping("/create")
    public String create(ModelMap modelMap) {
        modelMap.addAttribute("employee", new Employee());
        List<Position> positionList = positionService.findAll();
        List<Division> divisionList = divisionService.findAll();
        List<EducationDegree> educationList = educationService.findAll();
        modelMap.addAttribute("listDivision", divisionList);
        modelMap.addAttribute("listPosition", positionList);
        modelMap.addAttribute("listEducation", educationList);
        return "employee/create";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute Employee employee, BindingResult bindingResult, ModelMap modelMap) {
        if (bindingResult.hasFieldErrors()) {
            List<Position> positionList = positionService.findAll();
            List<Division> divisionList = divisionService.findAll();
            List<EducationDegree> educationList = educationService.findAll();
            modelMap.addAttribute("listDivision", divisionList);
            modelMap.addAttribute("listPosition", positionList);
            modelMap.addAttribute("listEducation", educationList);
            return "employee/create";
        }
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, ModelMap modelMap) {
        Employee employee = employeeService.findById(id);
        modelMap.addAttribute("employee", employee);
        List<Position> positionList = positionService.findAll();
        List<Division> divisionList = divisionService.findAll();
        List<EducationDegree> educationDegreeList = educationService.findAll();
        modelMap.addAttribute("listDivision", divisionList);
        modelMap.addAttribute("listPosition", positionList);
        modelMap.addAttribute("listEducation", educationDegreeList);
        return "employee/edit";
    }

    @PostMapping("/edit")
    public String edit(@Validated @ModelAttribute Employee employee){
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        employeeService.remove(id);
        return "redirect:/employee";
    }
}
