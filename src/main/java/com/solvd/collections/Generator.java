package com.solvd.collections;

import com.solvd.company.Company;
import com.solvd.company.ITCompany;
import com.solvd.company.department.DevelopmentDepartment;
import com.solvd.company.department.SalesDepartment;
import com.solvd.company.project.Meeting;
import com.solvd.company.project.Priority;
import com.solvd.company.project.Task;
import com.solvd.company.staff.*;
import com.solvd.contacts.Contacts;
import com.solvd.customLinkedList.CustomLinkedList;
import com.solvd.customer.Customer;
import com.solvd.customer.Status;
import com.solvd.customer.ValidateCustomer;
import com.solvd.exceptions.InvalidQualificationException;
import com.solvd.utils.Printer;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static com.solvd.company.department.DevelopmentDepartment.factory;

public class Generator{
    private static ArrayList<SoftwareDeveloper> employees = new ArrayList<>();
    private static Queue<Task> tasks = new LinkedList<>();
    private static Map<UUID, String> inventory = new HashMap<UUID, String>();
    private static List<Customer> customers = new ArrayList<>();
    private static Meeting meeting = new Meeting();

    public static Meeting generateMeeting() {
        employees = generateSoftwareDevelopers();
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

    public static ArrayList<SoftwareDeveloper> generateSoftwareDevelopers() {
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

    public static ArrayList<SalesManager> generateSalesManagers() {
        ArrayList<SalesManager> salesManagers = new ArrayList<>();
        salesManagers.add(new SalesManager(
                30,
                "Ivan",
                "Sirko",
                new Position("Sales Manager", 1700f, new HashSet<String>(Arrays.asList("add features", "fix bugs"))),
                new Qualification(3, new String[] {"Kyiv National University of Taras Schevchenko"})
        ));
        salesManagers.add(new SalesManager(
                32,
                "Ruslan",
                "Duginov",
                new Position("Lead Generator", 1200f, new HashSet<String>(Arrays.asList("converting raw data", "performance evaluation"))),
                new Qualification(1, new String[] {"Lviv University of Ivana Franka"})
        ));
        salesManagers.add(new SalesManager(
                28,
                "Olexiy",
                "Melnik",
                new Position("Business Development Manager", 3500f, new HashSet<String>(Arrays.asList("devising computer system", "design and implementation of complex systems"))),
                new Qualification(4, new String[] {"Lviv University of Ivana Franka"})
        ));
        return salesManagers;
    }
    public static SalesDepartment generateSalesDepartment() {
        return new SalesDepartment(
                "Solvd Sales & Business Department",
                generateSalesManagers(),
                new Contacts("itcompnay.sales@gmail.com", "+380958120395", "Kyiv, Stepana Bandery ave. 10"),
                generateCustomers().toArray(new Customer[0])
        );
    }

    public static String[] generateNewInventory() {
        inventory.put(UUID.randomUUID(), "Desk Stepler");
        inventory.put(UUID.randomUUID(), "Erasable Marker");
        inventory.put(UUID.randomUUID(), "Paper Clips");
        inventory.put(UUID.randomUUID(), "Fax Paper");
        return inventory.values().toArray(new String[0]);
    }

    public static void showLambdasExample() throws InvalidQualificationException {
        /* Predicate interface */
        List<Customer> customers = Generator.generateCustomers();
        List<Customer> validatedCustomers = ValidateCustomer.validate(customers, customer -> customer.getPaymentStatus() == Status.PAID);
        System.out.println(validatedCustomers);
        /* Consumer interface */
        Queue<Task> tasks = Generator.generateTasks();
        Consumer<Task> printConsumer = t -> System.out.println(t.toString());
        tasks.forEach(printConsumer);
        /* Supplier interface */
        Supplier customerSupplier = () -> customers.get(0);
        Customer randomCustomer = (Customer) customerSupplier.get();
        System.out.println(randomCustomer);
        /* Supplier's Factory */
//        SoftwareDeveloper developer = DevelopmentDepartment.factory(SoftwareDeveloper::new);
        SoftwareDeveloper developer = DevelopmentDepartment.factory(()->new SoftwareDeveloper("Yaroslav", "Moroz"));
        System.out.println(developer);
    }

    public static void showStreamsExample() throws InvalidQualificationException {
        SalesDepartment salesDepartment = generateSalesDepartment();
        System.out.println(salesDepartment);
        Printer.print("filter");
        salesDepartment.filterCustomers(Status.PAID);
        Printer.print("sort");
        salesDepartment.sortCustomersByPayment();
        Printer.print("take while");
        salesDepartment.checkStatus(Status.CANCELED);
        Printer.print("map");
        salesDepartment.getEmployeesFullNames().forEach(System.out::println);
    }
}
