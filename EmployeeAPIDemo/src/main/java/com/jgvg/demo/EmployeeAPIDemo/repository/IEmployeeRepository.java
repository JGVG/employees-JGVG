package com.jgvg.demo.EmployeeAPIDemo.repository;

import com.jgvg.demo.EmployeeAPIDemo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findEmployeeByName(@Param("name") String name);
    List<Employee> findEmployeeByEmail(@Param("email") String email);
    @Query(value = "SELECT * FROM employees ORDER BY emp_salary ASC LIMIT 1", nativeQuery = true)
    Employee findLowestSalaryEmployee();
    @Query(value = "SELECT * FROM employees ORDER BY emp_salary DESC LIMIT 1", nativeQuery = true)
    Employee findHightestSalaryEmployee();
    @Query(value = "SELECT * FROM employees ORDER BY emp_date_registry ASC LIMIT :n_results", nativeQuery = true)
    List<Employee> findNewEmployees(@Param("n_results") int n_results);
    @Query(value = "SELECT * FROM employees ORDER BY emp_date_registry DESC LIMIT :n_results", nativeQuery = true)
    List<Employee> findOldEmployees(@Param("n_results") int n_results);

}