package com.solvd.company.project;

import java.util.Objects;

public class Bug extends Issue {
    private ErrorType errorType;
    private boolean fixed;
    private String message;

    public Bug() {
    }

    public Bug(ErrorType errorType, boolean fixed, String message) {
        this.errorType = errorType;
        this.fixed = fixed;
        this.message = message;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    public void setErrorType(ErrorType errorType) {
        this.errorType = errorType;
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
        return errorType == bug.errorType &&
                fixed == bug.fixed && Objects.equals(message, bug.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorType, fixed, message);
    }

    @Override
    public String toString() {
        return "Bug: " +
                "errorType = " + errorType +
                " fixed = " + fixed +
                " message = " + message;
    }
}
