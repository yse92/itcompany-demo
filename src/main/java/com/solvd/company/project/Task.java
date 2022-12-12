package com.solvd.company.project;

import com.solvd.company.staff.Employee;

import java.util.Date;

public class Task extends Issue {
    private Date deadline;
    private Priority priority;

    public Task() {
    }

    public Task(int id, String title, String type, Date deadline, Priority priority) {
        super(id, title, type);
        this.deadline = deadline;
        this.priority = priority;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

}
