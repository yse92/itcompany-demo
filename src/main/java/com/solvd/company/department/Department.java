package com.solvd.company.department;

import com.solvd.company.staff.Employee;
import com.solvd.contacts.Contacts;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Department {
    private String name;
    private ArrayList<? extends Employee> employees = new ArrayList<>();
    private Contacts contacts;

    public Department() {

    }

    public Department(String name, ArrayList<? extends Employee> employees, Contacts contacts) {
        this.name = name;
        this.employees = employees;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public ArrayList<? extends Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    abstract void performWork();

    abstract void completePlan();

}
