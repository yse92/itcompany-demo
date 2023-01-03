package com.solvd.company.staff;

public enum TestType {
    UNIT("Unit"),
    SYSTEM("System"),
    REGRESSION("Regression"),
    SMOKE("Smoke"),
    ACCEPTANCE("Acceptance"),
    INTEGRATION("Integration");

    private String name;

    TestType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
