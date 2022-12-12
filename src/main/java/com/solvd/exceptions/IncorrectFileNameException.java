package com.solvd.exceptions;

public class IncorrectFileNameException extends Exception {
    public IncorrectFileNameException() {
        super("File name is incorrect!");
    }

    public IncorrectFileNameException(String message, Throwable cause) {
        super(message, cause);
    }
}
