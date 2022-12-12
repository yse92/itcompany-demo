package com.solvd.company;

import com.solvd.company.department.Department;
import com.solvd.company.project.Project;
import com.solvd.company.staff.Director;
import com.solvd.company.staff.SoftwareDeveloper;
import com.solvd.contacts.Contacts;
import com.solvd.customer.Customer;

import static com.solvd.Main.logger;
import static java.lang.System.*;

public class ITCompany extends Company {
    private SoftwareDeveloper[] developers;
    private Project project;
    private static int rating;
    final int registrationID = 8045652;

    public ITCompany(String name, Contacts contacts, Director director, Department departments,
                     SoftwareDeveloper[] developers, Project project) {
        super(name, contacts, director, departments);
        this.developers = developers;
        this.project = project;
    }

    public static void testService(int mark) {
        rating = (mark + rating) / 2;
    }

    @Override
    void createProject() {
        for(SoftwareDeveloper developer : developers) {
            logger.info(developer.getName() + " received task successfully!");
        }
        logger.info("Project " + project.getName() + " started successfully!");
    }

    @Override
    void conveneMeeting() {
        logger.info("Director " + getDirector().getName() + " leads a meeting!");
        for(SoftwareDeveloper developer : developers) {
            logger.info(developer.getName() + " joined!");
        }
    }

    @Override
    void receiveOrder(Customer customer) {
        logger.info("Director " + getDirector().getName() + " and " + customer.getName() + " entered into agreement");
    }
}
