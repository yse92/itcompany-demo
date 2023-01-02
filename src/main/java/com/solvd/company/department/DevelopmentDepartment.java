package com.solvd.company.department;

import com.solvd.company.staff.Position;
import com.solvd.company.staff.Qualification;
import com.solvd.company.staff.Skills;
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
            developer.setName("Default name");
        }
        if (developer.getSurname() == null || "".equals(developer.getSurname())) {
            developer.setSurname("Default surname");
        }
        developer.setQualification(
                new Qualification(
                        new Random().nextInt(10) + 2,
                        new String[] {"School", "University"}
                )
        );
        developer.setPosition(new Position("java Developer", 1000f, new HashSet<>() {{
            add("responsibilty 1");
            add("responsibilty 2");
        }}));
        developer.setSkill(Skills.JUNIOR);
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
