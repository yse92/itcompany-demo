package com.solvd.company.staff;

import com.solvd.company.project.Task;
import com.solvd.exceptions.SolvableTaskException;

public interface Solvable {
    void solveTask(Task task) throws SolvableTaskException;
}
