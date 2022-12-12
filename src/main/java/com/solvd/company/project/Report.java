package com.solvd.company.project;

import com.solvd.company.staff.Employee;

import java.util.Date;

public class Report {
    private int id;
    private String summary;
    private Date date;
    private Employee tester;
    private Bug bug;

    public Report() {
    }

    public Report(int id, String summary, Date date, Employee tester, Bug bug) {
        this.id = id;
        this.summary = summary;
        this.date = date;
        this.tester = tester;
        this.bug = bug;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employee getTester() {
        return tester;
    }

    public void setTester(Employee tester) {
        this.tester = tester;
    }

    public Bug getBug() {
        return bug;
    }

    public void setBug(Bug bug) {
        this.bug = bug;
    }


}
