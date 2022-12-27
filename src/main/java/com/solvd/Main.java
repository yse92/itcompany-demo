package com.solvd;

import com.solvd.collections.Generator;
import com.solvd.company.department.SalesDepartment;
import com.solvd.company.project.Meeting;
import com.solvd.company.staff.*;
import com.solvd.contacts.Contacts;
import com.solvd.customer.Customer;
import com.solvd.customer.Status;
import com.solvd.exceptions.IncorrectFileNameException;
import com.solvd.exceptions.InvalidQualificationException;
import com.solvd.reflection.Reflection;
import com.solvd.utils.Printer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IncorrectFileNameException, IOException, InvalidQualificationException {
        /* StringUtils */
//        String result = "";
//        String[] criterias = {"Lorem", "has", "and"};
//        String input = FilesUtil.readTextFile("src/main/resources/test2.txt");
//        for (String targetWord : criterias) {
//            int count = countMatches(input, capitalize(targetWord)) + countMatches(input, uncapitalize(targetWord));
//            result += count + " " + targetWord + "\n";
//        }
//        FilesUtil.writeToTextFile("src/main/resources/test3.txt", result);
        /* Lambdas */
//        /* Predicate interface */
//        List<Customer> customers = Generator.generateCustomers();
//        List<Customer> validatedCustomers = ValidateCustomer.validate(customers, customer -> {
//            return customer.getPaymentStatus() == Status.PAID;
//        });
//        /* Consumer interface */
//        Queue<Task> tasks = Generator.generateTasks();
//        Consumer<Task> printConsumer = t -> System.out.println(t.toString());
//        tasks.forEach(printConsumer);
//        /* Supplier interface */
//        Supplier customerSupplier = () -> customers.get(0);
//        Customer randomCustomer = (Customer) customerSupplier.get();
//        System.out.println(randomCustomer);
//        /* Supplier's Factory */
//        SoftwareDeveloper developer = factory(() -> new SoftwareDeveloper(18, "Ivan", "Gryschenko", Skills.JUNIOR));
//        System.out.println(developer);
        /* Reflection */
//        Meeting meeting = Generator.generateMeeting();
//        ArrayList<Employee> employee = Generator.generateEmployees();
//        //get private fields
//        Reflection.printField(meeting, "participants");
//        System.out.println("-------------------------------------");
//        //invoke private method
//        Reflection.printMethod(meeting, "addParticipant", employee.get(0));
//        System.out.println("-------------------------------------");
//        Reflection.printAllMethods(employee.get(0));
        /* Stream */
//        List<Customer> customers = Generator.generateCustomers();
//        ArrayList<Employee> employees = Generator.generateEmployees();
//        SalesDepartment salesDepartment = new SalesDepartment(
//                "SalesIT",
//                employees,
//                new Contacts("email", "044-232-23-43", "Kyiv, Ukraine"),
//                customers.toArray(new Customer[0])
//        );
//        Printer.print("filter");
//        salesDepartment.filterCustomers(Status.PAID);
//        Printer.print("sort");
//        salesDepartment.sortCustomersByPayment();
//        Printer.print("take while");
//        salesDepartment.checkStatus(Status.CANCELED);
//        Printer.print("map");
//        salesDepartment.getEmployeesFullNames().forEach(System.out::println);

    }
}
