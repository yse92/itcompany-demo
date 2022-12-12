package com.solvd.company.project;

import com.solvd.company.department.IPrintable;
import com.solvd.company.staff.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class Meeting implements IMeeting, IPrintable {
    private Date time;
    private Issue issue;

    private ArrayList<Employee> participants = new ArrayList<>();

    public Meeting() {
    }

    public Meeting(Date time, Issue issue, ArrayList<Employee> participants) {
        this.time = time;
        this.issue = issue;
        this.participants = participants;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public ArrayList<Employee> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<Employee> participants) {
        this.participants = participants;
    }

    @Override
    public void assembleMeeting(Employee... employees) {
        Collections.addAll(participants, employees);
    }

    @Override
    public void addParticipant(Employee employee) {
        participants.add(employee);
    }

    @Override
    public void alarmParticipants() {
        IMeeting.super.alarmParticipants();
    }

    @Override
    public void printDetails() {
        if (participants == null) {
            throw new NullPointerException("Array of participants should be initialized");
        }
        System.out.println("Date: " + this.time + "\nIssue: " + this.issue);
        for (Employee participant : participants) {
            System.out.println("Name: " + participant.getName() + "\nSurname: " + participant.getSurname());
        }
    }
}
