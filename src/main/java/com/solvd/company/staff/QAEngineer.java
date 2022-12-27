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
        switch (type) {
            case UNIT:
                System.out.println("Perform Unit Testing");
                break;
            case SMOKE:
                System.out.println("Perform Smoke Testing");
                break;
            case SYSTEM:
                System.out.println("Perform System Testing");
                break;
            case ACCEPTANCE:
                System.out.println("Perform Acceptance Testing");
                break;
            case REGRESSION:
                System.out.println("Perform Regression Testing");
                break;
            case INTEGRATION:
                System.out.println("Perform Integration Testing");
                break;
            default:
                System.out.println("Drinking coffee ^_^");
        }

    }
}
