package com.solvd.company;

import com.solvd.company.department.Department;
import com.solvd.company.staff.Director;
import com.solvd.contacts.Contacts;
import com.solvd.customer.Customer;

public abstract class Company {
    private String name;
    private Contacts contacts;
    private Director director;
    private Department departments;

    public Company() {
    }

    public Company(String name, Contacts contacts, Director director, Department departments) {
        this.name = name;
        this.contacts = contacts;
        this.director = director;
        this.departments = departments;
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

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Department getDepartments() {
        return departments;
    }

    public void setDepartments(Department departments) {
        this.departments = departments;
    }

    abstract void createProject();

    abstract void conveneMeeting();

    abstract void receiveOrder(Customer customer);
}
