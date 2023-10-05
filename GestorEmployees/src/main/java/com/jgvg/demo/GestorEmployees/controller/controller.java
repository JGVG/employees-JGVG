package com.jgvg.demo.GestorEmployees.controller;

import com.jgvg.demo.GestorEmployees.inferfaces.IEmployeeService;
import com.jgvg.demo.GestorEmployees.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/demo/v1")
public class controller {
    @Autowired
    private IEmployeeService service;

    @GetMapping("/employees")
    public String getEmployees(Model model){
        List<Employee> employees = service.getEmployees();

        model.addAttribute("employees", employees);
        return "index";
    }

    @GetMapping("/addEmployee")
    public String addEmployee(Model model){
        model.addAttribute("employee", new Employee());
        return "add";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@Validated Employee emp, Model model){
        service.createEmployee(emp);
        return "redirect:/demo/v1/employees";
    }

    @GetMapping("/editEmployee/{id}")
    public String editEmployee(@PathVariable int id, Model model){
        Optional<Employee> employee = service.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "edit";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id, Model model){
        service.deleteEmployee(id);
        return "redirect:/demo/v1/employees";
    }

}
