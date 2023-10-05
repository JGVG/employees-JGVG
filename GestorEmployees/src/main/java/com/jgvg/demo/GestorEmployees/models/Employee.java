package com.jgvg.demo.GestorEmployees.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private long phone;
    private String email;
    private String registry;
    private String nSegSocial;
    private long salary;

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