package com.solvd.exceptions;

public class FixableBugException extends Exception {
    public FixableBugException() {
        super("This big cannot be fixed by default");
    }

    public FixableBugException(String message) {
        super(message);
    }
}
