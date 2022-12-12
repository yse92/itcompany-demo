package com.solvd.exceptions;

public class ZeroBudgetException extends Exception{
    public ZeroBudgetException() {
        super("Budget can't be lower than 0");
    }

    public ZeroBudgetException(String message) {
        super(message);
    }
}
