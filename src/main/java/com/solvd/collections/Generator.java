package com.solvd.collections;

import com.solvd.company.Company;
import com.solvd.company.ITCompany;
import com.solvd.company.project.Meeting;
import com.solvd.company.project.Priority;
import com.solvd.company.project.Task;
import com.solvd.company.staff.*;
import com.solvd.contacts.Contacts;
import com.solvd.customLinkedList.CustomLinkedList;
import com.solvd.customer.Customer;
import com.solvd.customer.Status;

import java.util.*;

public class Generator{
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Queue<Task> tasks = new LinkedList<>();
    private static Map<UUID, String> inventory = new HashMap<UUID, String>();
    private static List<Customer> customers = new ArrayList<>();
    private static Meeting meeting = new Meeting();

    public static Meeting generateMeeting() {
        employees = generateEmployees();
        meeting =   new Meeting(new Date(),
                    new Task(1, "title", "type", new Date(), Priority.MEDIUM),
                    employees.toArray(new Employee[0]));
        return meeting;
    }

    public static List<Customer> generateCustomers() {
        customers.add(new Customer(
           "Yaroslav",
           "Moroz",
           new Contacts("yarikmoroz@gmail.com", "+380661230909", "Kyiv, Bogolyubova 6"),
           Status.CANCELED
        ));
        customers.add(new Customer(
                "Mykola",
                "Berejhnoy",
                new Contacts("mykolay888@gmail.com", "+380982220505", "Kharkiv, Nauky ave. 23"),
                Status.PAID
        ));
        customers.add(new Customer(
                "Vasyl",
                "Sobol",
                new Contacts("vasylsaveyrty@gmail.com", "+380990020302", "Dnepr, Gagarina ave. 55"),
                Status.PAID
        ));
        customers.add(new Customer(
                "Charles",
                "Dickens",
                new Contacts("charlydns909@gmail.com", "+380930120398", "Kyiv, Stepana Bandery ave. 25"),
                Status.CANCELED
        ));
        return customers;
    }

    public static ArrayList<Employee> generateEmployees() {
        employees.add(new SoftwareDeveloper(
                30,
                "Yaroslav",
                "Moroz",
                new Position("Developer", 4500f, new HashSet<String>(Arrays.asList("add features", "fix bugs"))),
                new Qualification(1, new String[] {"Kyiv Polytech University"}),
                Skills.JUNIOR
        ));
        employees.add(new SoftwareDeveloper(
                32,
                "Leonard",
                "Euler",
                new Position("Data Engineer", 5800f, new HashSet<String>(Arrays.asList("converting raw data", "performance evaluation"))),
                new Qualification(3, new String[] {"Lviv University of Ivana Franka"}),
                Skills.MIDDLE
        ));
        employees.add(new SoftwareDeveloper(
                28,
                "Barbara",
                "Liskov",
                new Position("System Archytect", 12000f, new HashSet<String>(Arrays.asList("devising computer system", "design and implementation of complex systems"))),
                new Qualification(8, new String[] {"Lviv University of Ivana Franka"}),
                Skills.SENIOR
        ));
        return employees;
    }

    public static Queue<Task> generateTasks() {
        tasks.add(
                new Task(
                        1,
                        "Bug#9230",
                        "Warning",
                        new Date(),
                        Priority.MEDIUM
                )
        );
        tasks.add(
                new Task(
                        2,
                        "Issue#6599",
                        "Mismatch types",
                        new Date(),
                        Priority.HIGH
                )
        );
        tasks.add(
                new Task(
                        3,
                        "Issue#0788",
                        "Missing btn",
                        new Date(),
                        Priority.HIGH
                )
        );
        return tasks;
    }

    public static String[] generateNewInventory() {
        inventory.put(UUID.randomUUID(), "Desk Stepler");
        inventory.put(UUID.randomUUID(), "Erasable Marker");
        inventory.put(UUID.randomUUID(), "Paper Clips");
        inventory.put(UUID.randomUUID(), "Fax Paper");
        return inventory.values().toArray(new String[0]);
    }
}
