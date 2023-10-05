package com.jgvg.demo.GestorEmployees.services;

import com.jgvg.demo.GestorEmployees.inferfaces.IEmployeeService;
import com.jgvg.demo.GestorEmployees.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        Employee[] response = restTemplate.getForObject(
                "http://employee-api-demo-0.0.1:8081/api/getAllEmployees",
                    Employee[].class
        );
        if(response != null){
            employees = Arrays.asList(response);
        }
        return employees;
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        Employee response = restTemplate.getForObject(
                "http://employee-api-demo-0.0.1:8081/api/getEmployeeById?id={id}",
                Employee.class,
                id
        );
        if(response != null){
            return Optional.of(response);
        }
        return Optional.empty();
    }

    @Override
    public int createEmployee(Employee emp) {
        int res = 0;
        Employee employee = restTemplate.postForObject(
                "http://employee-api-demo-0.0.1:8081/api/createEmployee",
                emp, Employee.class
        );
        if(employee != null){
            res= 1;
        }
        return res;
    }

    @Override
    public void deleteEmployee(int id) {
        restTemplate.delete("http://employee-api-demo-0.0.1:8081/api/deleteEmployee?id={id}", id);
    }
}
