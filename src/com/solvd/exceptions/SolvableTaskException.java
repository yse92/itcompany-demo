package com.solvd.exceptions;

public class SolvableTaskException extends Exception {
    public SolvableTaskException() {
        super("Task cannot be solved");
    }

    public SolvableTaskException(String message) {
        super(message);
    }
}
