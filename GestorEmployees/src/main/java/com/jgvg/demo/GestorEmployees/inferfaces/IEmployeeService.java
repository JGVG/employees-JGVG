package com.jgvg.demo.GestorEmployees.inferfaces;
import com.jgvg.demo.GestorEmployees.models.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    public List<Employee> getEmployees();
    public Optional<Employee> getEmployeeById(int id);
    public int createEmployee(Employee employee);
    public void deleteEmployee(int id);
}
