package com.solvd.company.department;

import com.solvd.company.staff.Position;
import com.solvd.company.staff.Qualification;
import com.solvd.company.staff.SoftwareDeveloper;
import com.solvd.exceptions.InvalidQualificationException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.function.Supplier;

public class DevelopmentDepartment extends Department{
    public static SoftwareDeveloper factory(Supplier<SoftwareDeveloper> s)
            throws InvalidQualificationException {
        SoftwareDeveloper developer = s.get();
        if (developer.getName() == null || "".equals(developer.getName())) {
            developer.setName("default");
        }
        developer.setQualification(new Qualification(new Random().nextInt(10) + 1, new String[] {"abc", "def"}));
        developer.setPosition(new Position("Junior Dev", 800f, new HashSet<String>() {{
            add("responsibilty 1");
            add("responsibilty 2");
        }}));
        return developer;
    }

    @Override
    void performWork() {
        System.out.println("We develop software!");
    }

    @Override
    void completePlan() {
        System.out.println("We have just completed plan!");
    }
}
