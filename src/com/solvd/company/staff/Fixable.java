package com.solvd.company.staff;

import com.solvd.company.project.Bug;
import com.solvd.company.project.Task;
import com.solvd.exceptions.FixableBugException;

public interface Fixable {
    void fixBug(Bug bug) throws FixableBugException;
}
