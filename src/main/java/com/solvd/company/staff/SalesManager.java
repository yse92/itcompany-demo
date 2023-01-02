package com.solvd.company.staff;

public class SalesManager extends Employee {
    public SalesManager(int age, String name, String surname, Position position, Qualification qualification) {
        super(age, name, surname, position, qualification);
    }

    @Override
    void improveSkills() {
        System.out.println(this.getName() + " " +
                this.getSurname() +
                " have passed IT Sales Management cources successfully at EPAM University!");
    }

    @Override
    void getResponsibilities(Position position) {
        System.out.println("Develop and manage relationships with potential customers.");
    }
}
