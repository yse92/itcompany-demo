package com.solvd.exceptions;

public class InvalidQualificationException extends Exception {
    public InvalidQualificationException() {
        super("Qualification is invalid");
    }

    public InvalidQualificationException(String message) {
        super(message);
    }
}
