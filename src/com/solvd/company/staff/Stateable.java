package com.solvd.company.staff;

public interface Stateable {
    int BUSY = 1;
    int FREE = 0;
    void printState(int n);
}
