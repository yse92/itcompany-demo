package com.solvd.company.project;

import com.solvd.company.staff.Employee;
import com.solvd.customer.Customer;

import java.util.ArrayList;

public class Project {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();
    private Customer customer;
    private float budget;

    public Project() {
    }

    public Project(String name, ArrayList<Employee> employees, Customer customer, float budget) {
        this.name = name;
        this.employees = employees;
        this.customer = customer;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }
}
