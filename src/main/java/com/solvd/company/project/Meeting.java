package com.solvd.company.project;

import com.solvd.company.department.IPrintable;
import com.solvd.company.staff.Employee;
import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class Meeting implements IMeeting, IPrintable {
    private Date time;
    private Issue issue;

    private Employee [] participants;

    public Meeting() {
    }

    public Meeting(Date time, Issue issue, Employee [] participants) {
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

    public Employee [] getParticipants() {
        return participants;
    }

    public void setParticipants(Employee [] participants) {
        this.participants = participants;
    }

    @Override
    public void assembleMeeting(Employee[] employees) {
        participants = ArrayUtils.addAll(participants, employees);
    }

    private void addParticipant(Employee employee) {
        participants = ArrayUtils.add(participants, employee);
        System.out.println("Participant " + employee.getName() + " successfully added!");
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
        Arrays.stream(participants).forEach(participant ->
                System.out.println("Name: " + participant.getName() + "\nSurname: " + participant.getSurname()));
    }
}
