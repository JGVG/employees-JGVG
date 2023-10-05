package com.jgvg.demo.EmployeeAPIDemo.models;

import jakarta.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "emp_name", length = 25)
    private String name;
    @Column(name = "emp_phone", length = 9)
    private long phone;
    @Column(name = "emp_email", length = 25)
    private String email;
    @Column(name = "emp_date_registry")
    private String registry;
    @Column(name = "emp_seg_social", length = 9)
    private String nSegSocial;
    @Column(name = "emp_salary")
    private long salary;

    public Employee() {

    }

    public Employee(int id, String name, long phone, String email, String registry, String nSegSocial, long salary) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.registry = registry;
        this.nSegSocial = nSegSocial;
        this.salary = salary;
    }

    @PrePersist
    private void onCreate() {
        registry = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public String getnSegSocial() {
        return nSegSocial;
    }

    public void setnSegSocial(String nSegSocial) {
        this.nSegSocial = nSegSocial;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", registry=" + registry +
                ", nSegSocial='" + nSegSocial + '\'' +
                ", salary=" + salary +
                '}';
    }
}