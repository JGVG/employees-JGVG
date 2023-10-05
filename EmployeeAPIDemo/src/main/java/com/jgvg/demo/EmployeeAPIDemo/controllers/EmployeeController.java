package com.jgvg.demo.EmployeeAPIDemo.controllers;

import com.jgvg.demo.EmployeeAPIDemo.repository.IEmployeeRepository;
import com.jgvg.demo.EmployeeAPIDemo.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private IEmployeeRepository repository;

    // - LOW CRUD QUERIES -

    @PostMapping("/createEmployee") // Ej: http://localhost:8081/api/createEmployee
    public Employee createEmployee(@RequestBody Employee emp) {
        return repository.save(emp);
    }

    @PutMapping("/updateEmployee") // Ej: http://localhost:8081/api/updateEmployee?id=5
    public Employee updateEmployee(@RequestParam int id ,@RequestBody Employee emp) {
        return repository.save(emp);
    }

    @DeleteMapping("/deleteEmployee") // Ej: http://localhost:8081/api/deleteEmployee?id=5
    public void deleteEmployee(@RequestParam Long id) {
        repository.deleteById(id);
    }

    // - MID LEVEL QUERIES -

    @GetMapping("/getAllEmployees") // Ej: http://localhost:8081/api/getAllEmployees
    public List<Employee> findAllEmployees(){
        return repository.findAll();
    }

    @GetMapping("/getEmployeeById") // Ej: http://localhost:8081/api/getEmployeeById?id=5
    public Optional<Employee> findEmployeeById(@RequestParam Long id) {
        return repository.findById(id);
    }

    @GetMapping("/getEmployeeByName") // Ej: http://localhost:8081/api/getEmployeeByName?name=Manuel
    public List<Employee> findEmployeeByFirstName(@RequestParam String name) {
        return repository.findEmployeeByName(name);
    }

    @GetMapping("/getEmployeeByEmail") // Ej: http://localhost:8081/api/getEmployeeByEmail?email=jgaby1997@gmail.com
    public List<Employee> findEmployeeByEmail(@RequestParam String email) {
        return repository.findEmployeeByEmail(email);
    }

    // - HIGHT LEVEL QUERIES -

    @GetMapping("/getLowestSalaryEmployee") // Ej: http://localhost:8081/api/getLowestSalaryEmployee
    public Employee findLowestSalaryEmployee() {
        return repository.findLowestSalaryEmployee();
    }

    @GetMapping("/getHightestSalaryEmployee") // Ej: http://localhost:8081/api/getHightesSalaryEmployee
    public Employee findHightestSalaryEmployee() {
        return repository.findHightestSalaryEmployee();
    }

    @GetMapping("/getNewEmployees") // Ej: http://localhost:8081/api/getNewEmployees?n_results=3
    public List<Employee> findNewEmployees(@RequestParam int n_results) {
        return repository.findNewEmployees(n_results);
    }

    @GetMapping("/getOldEmployees") // Ej: http://localhost:8081/api/getOldEmployees?n_results=2
    public List<Employee> findOldEmployees(@RequestParam int n_results) {
        return repository.findOldEmployees(n_results);
    }


}
