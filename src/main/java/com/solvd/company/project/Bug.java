package com.solvd.company.project;

import java.util.Objects;

public class Bug extends Issue {
    private int statusCode;
    private boolean fixed;
    private String message;

    public Bug() {
    }

    public Bug(int statusCode, boolean fixed, String message) {
        this.statusCode = statusCode;
        this.fixed = fixed;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                                         //reflexivity
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;                       //symmetry
        Bug bug = (Bug) o;
        return  statusCode == bug.statusCode &&
                fixed == bug.fixed && Objects.equals(message, bug.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, fixed, message);
    }

    @Override
    public String toString() {
        return "Bug: " +
                "statusCode = " + statusCode +
                " fixed = " + fixed +
                " message = " + message;
    }
}
