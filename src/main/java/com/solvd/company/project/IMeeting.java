package com.solvd.company.project;

import com.solvd.company.staff.Employee;

public interface IMeeting {
    String URL = "meet.google.com/abc-def-ghj";
    void assembleMeeting(Employee ...employees);
//    void addParticipant(Employee employee);
    default void alarmParticipants() {
        System.out.println("Meeting has already started!");
    }
}
