package com.solvd.company.staff;

public class QAEngineer extends Employee{
    @Override
    public void improveSkills() {
        System.out.println(this.getName() + " " +
                this.getSurname() +
                " have passed Solvd Laba successfully!");
    }

    @Override
    public void getResponsibilities(Position position) {
        System.out.println("I have learnt about my responsibilities by heart!");
    }

    public void performTesting(TestType type) {
        System.out.println("Performing : " + type.getName());
    }
}
