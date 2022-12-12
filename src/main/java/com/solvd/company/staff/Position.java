package com.solvd.company.staff;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.HashSet;

public class Position{
    private String name;
    private float salary;
    private HashSet<String> responsibilities;

    public Position() {
    }

    public Position(String name, float salary, HashSet<String> responsibilities) {
        this.name = name;
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", responsibilities=" + Arrays.toString(responsibilities.toArray()) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public HashSet<String> getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(HashSet<String> responsibilities) {
        this.responsibilities = responsibilities;
    }

}
