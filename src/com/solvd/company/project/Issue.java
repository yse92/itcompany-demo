package com.solvd.company.project;

import com.solvd.company.staff.Employee;

abstract public class Issue {
    private int id;
    private String title;
    private String type;
    private Employee responsible;

    public Issue() {
    }

    public Issue(int id, String title, String type) {
        this.id = id;
        this.title = title;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Employee getResponsible() {
        return responsible;
    }

    public void setResponsible(Employee responsible) {
        this.responsible = responsible;
    }

}
