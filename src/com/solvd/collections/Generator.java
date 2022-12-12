package com.solvd.collections;

import com.solvd.company.Company;
import com.solvd.company.project.Priority;
import com.solvd.company.project.Task;
import com.solvd.company.staff.Position;
import com.solvd.company.staff.Qualification;
import com.solvd.company.staff.SoftwareDeveloper;
import com.solvd.customLinkedList.CustomLinkedList;

import java.util.*;

public class Generator{
    private CustomLinkedList<SoftwareDeveloper> employees = new CustomLinkedList<>() {};
    private Queue<Task> tasks = new LinkedList<>();
    private Map<UUID, String> inventory = new HashMap<UUID, String>();

    public Generator(Company company) {
        generateEmployees(company);
        generateTasks();
        generateNewInventory();
    }

    public void generateEmployees(Company company) {
        employees.insert(new SoftwareDeveloper(
                30,
                "Yaroslav",
                "Moroz",
                new Position("Developer", 4500f, new HashSet<String>(Arrays.asList("add features", "fix bugs"))),
                new Qualification(1, new String[] {"Kyiv Polytech University"})
        ));
        employees.insert(new SoftwareDeveloper(
                32,
                "Leonard",
                "Euler",
                new Position("Data Engineer", 5800f, new HashSet<String>(Arrays.asList("converting raw data", "performance evaluation"))),
                new Qualification(3, new String[] {"Lviv University of Ivana Franka"})
        ));
        employees.insert(new SoftwareDeveloper(
                28,
                "Barbara",
                "Liskov",
                new Position("System Archytect", 12000f, new HashSet<String>(Arrays.asList("devising computer system", "design and implementation of complex systems"))),
                new Qualification(8, new String[] {"Lviv University of Ivana Franka"})
        ));
    }

    public void generateTasks() {
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
    }

    public void generateNewInventory() {
        inventory.put(UUID.randomUUID(), "Desk Stepler");
        inventory.put(UUID.randomUUID(), "Erasable Marker");
        inventory.put(UUID.randomUUID(), "Paper Clips");
        inventory.put(UUID.randomUUID(), "Fax Paper");
    }
}
