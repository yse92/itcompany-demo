package com.solvd.company.staff;
import static com.solvd.Main.logger;
import static java.lang.System.*;

import com.solvd.company.project.Bug;
import com.solvd.company.project.ErrorType;
import com.solvd.company.project.Task;
import com.solvd.exceptions.FixableBugException;
import com.solvd.exceptions.SolvableTaskException;

import java.util.HashSet;
import java.util.Objects;

public class SoftwareDeveloper extends Employee implements Fixable, Solvable, Stateable{
    private Skills skill;

    public SoftwareDeveloper(int age, String name, String surname, Position position, Qualification qualification, Skills skill) {
        super(age, name, surname, position, qualification);
        this.skill = skill;
    }

    public Skills getSkill() {
        return skill;
    }

    public void setSkill(Skills skill) {
        this.skill = skill;
    }

    public void fixBug(Bug bug) throws FixableBugException {
        if (bug.getErrorType() == ErrorType.SYNTAX) {
            throw new FixableBugException();
        }
        bug.setFixed(true);
        logger.info("Bug " + bug.getErrorType() + " has been successfully fixed!");
    }

    public void solveTask(Task task) throws SolvableTaskException {
        if (Objects.equals(task.getTitle(), "Halting problem")) {
            throw new SolvableTaskException();
        }
        task.setResponsible(this);
        if (System.currentTimeMillis() > task.getDeadline().getTime()) {
            logger.info("Task " + task.getTitle() + " has been successfully fixed!");
        } else {
            logger.info("Warning! Task " + task.getTitle() + " is overdue!");
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return this.getClass().toString() + "\n" + getName() + "\n" + getSurname() + "\n"
                + getAge() + "\n" + getPosition() + "\n" + getQualification();
    }

    @Override
    void improveSkills() {
        out.println(this.getName() + " passed courses successfully!");
    }

    @Override
    void getResponsibilities(Position position) {
        out.println("I have already learned my duties!");
    }

    @Override
    public void printState(int n) {
        if (n == BUSY)
            logger.info(getName() + " " + getSurname() + " is solving task");
        else if (n == FREE)
            logger.info(getName() + " " + getSurname() + " is ready to get more tasks");
        else
            logger.warn("State is invalid");
    }
}
