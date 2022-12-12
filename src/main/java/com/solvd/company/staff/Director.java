package com.solvd.company.staff;
import com.solvd.company.project.Issue;

import static com.solvd.Main.logger;
import static java.lang.System.*;

public class Director extends Employee implements Stateable {
    public void addStaff(Employee employee) {
        logger.info("New employee " + employee + " successfully joined our team!");
    }

    public void removeStaff(Employee employee) {
        logger.info(employee + " unfortunately left our team!");
    }

    public void approveProject() {
        logger.info("Project plan has been successfully approved!");
    }

    public void rebukeEmployee(Issue issue) {
        Employee responsible = issue.getResponsible();
        logger.info("I had rebuked " + responsible.getPosition() + " " + responsible.getName() +
                    " for the uncompleted task + " + issue.getTitle());
    }

    public void assignTask(Employee employee, Issue issue) {
        issue.setResponsible(employee);
    }

    @Override
    void improveSkills() {
        logger.info("I have got financial management's certificate");
    }

    @Override
    void getResponsibilities(Position position) {
        logger.info("I know my responsibilities by heart");
    }

    @Override
    public void printState(int n) {
        if (n == BUSY)
            logger.warn("Director is busy");
        else if (n == FREE)
            logger.info("Director is free");
        else
            logger.error("State is invalid");
    }
}
