package com.solvd.exceptions;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Age is invalid");
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
