package com.example.case_study.controller;

import com.example.case_study.model.*;
import com.example.case_study.service.contract.IAttachServiceService;
import com.example.case_study.service.contract.IContractDetailService;
import com.example.case_study.service.contract.IContractService;
import com.example.case_study.service.customer.ICustomerService;
import com.example.case_study.service.employee.IEmployeeService;
import com.example.case_study.service.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private IContractService contractService;
    @Autowired
    private IAttachServiceService attachServiceService;
    @Autowired
    private IContractDetailService contractDetailService;
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private IServiceService serviceService;
    @GetMapping("")
    public String showList(@PageableDefault(size = 5)Pageable pageable, ModelMap modelMap){
        Page<Contract> list = contractService.findAll(pageable);
        modelMap.addAttribute("listContract", list);
        return "contract/list";
    }
    @GetMapping("/create")
    public String create(ModelMap modelMap,Pageable pageable){
        modelMap.addAttribute("contract", new Contract());
        List<Employee> employeeList = employeeService.findAll();
        List<Customer> customerList = (List<Customer>) customerService.findAll();
        List<Service> serviceList = serviceService.findAll();
        modelMap.addAttribute("employee", employeeList);
        modelMap.addAttribute("customer", customerList);
        modelMap.addAttribute("service", serviceList);
        return "contract/create1";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Contract contract){
        contractService.save(contract);
        return "redirect:/contract";
    }
    @GetMapping("/contract-detail/create")
    public String createContractDetail(ModelMap modelMap){
        List<Contract> contractList = contractService.findAll();
        List<AttachService> attachServiceList = attachServiceService.findAll();
        modelMap.addAttribute("listContract",contractList);
        modelMap.addAttribute("listAttachService", attachServiceList);
        modelMap.addAttribute("contractDetail", new ContractDetail());
        return "contract/create2";
    }

    @PostMapping("/contract-detail/create")
    public String createContractDetail(@ModelAttribute ContractDetail contractDetail){
        contractDetailService.save(contractDetail);
        return "redirect:/contract";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        contractService.remove(id);
        return "redirect:/contract";
    }
}