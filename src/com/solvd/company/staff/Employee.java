package com.solvd.company.staff;

import com.solvd.exceptions.InvalidAgeException;
import com.solvd.exceptions.InvalidQualificationException;

import java.io.FileNotFoundException;
import java.io.IOException;

import static com.solvd.Main.logger;

public abstract class Employee {
    private int age;
    private String name;
    private String surname;
    private Position position;
    private Qualification qualification;

    public Employee() {
    }

    public Employee(int age, String name, String surname, Position position, Qualification qualification) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.qualification = qualification;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Employee must be 18 year old at least");
        } else if (age > 80) {
            throw new InvalidAgeException("Employee must be less than 80 year old");
        } else {
            this.age = age;
            logger.info("Age is validated successfully!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) throws InvalidQualificationException {
        if (qualification.getExperience() == 0) {
            throw new InvalidQualificationException("Experience must be not 0");
        }
        logger.info("Experience is enough for applying the job!");
        this.position = position;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    abstract void improveSkills();

    abstract void getResponsibilities(Position position);

}
