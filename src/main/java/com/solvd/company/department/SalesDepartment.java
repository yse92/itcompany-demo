package com.solvd.company.department;

import com.solvd.company.staff.Employee;
import com.solvd.contacts.Contacts;
import com.solvd.customer.Customer;
import com.solvd.customer.Status;
import com.solvd.exceptions.ZeroBudgetException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.solvd.Main.logger;
import static java.lang.System.out;

public class SalesDepartment extends Department implements IPrintable {
    private Customer[] customers;
    static float budget = 1000000f;

    public SalesDepartment() {
    }

    public SalesDepartment(Customer[] customers) {
        this.customers = customers;
    }

    public SalesDepartment(String name, ArrayList<? extends Employee> employees, Contacts contacts, Customer[] customers) {
        super(name, employees, contacts);
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public static void increaseBudget(float money) throws ZeroBudgetException {
        if (money < 0) {
            throw new ZeroBudgetException();
        }
        budget += money;
    }

    public static void decreaseBudget(float money) throws ZeroBudgetException {
        if (money > budget) {
            throw new ZeroBudgetException();
        }
        budget -= money;
    }

    public void filterCustomers(Status status) {
        Arrays.stream(customers).filter(customer-> customer.getPaymentStatus() == status).forEach(out::println);
    }

    public void sortCustomersByPayment() {
        Arrays.stream(customers).sorted(Comparator.comparingInt(Customer::getPayment))
                .collect(Collectors.toList()).forEach(System.out::println);
    }

    public void checkStatus(Status status) {
        Arrays.stream(customers).takeWhile(customer -> customer.getPaymentStatus() == status).forEach(out::println);
    }

    public Stream<String> getEmployeesFullNames() {
        return getEmployees().stream().map(e -> e.getName() + " " + e.getSurname());
    }

    @Override
    public void performWork() {
        logger.info("We sell our product successfully!");
    }

    @Override
    public void completePlan() {
        logger.info("Sales plan has been successfully completed!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                    //reflexivity
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;  //symmetry
        SalesDepartment that = (SalesDepartment) o;
        return Arrays.equals(customers, that.customers);
    }

    @Override
    public String toString() {
        return "SalesDepartment: " + this.getName() + " " +
                "customers " + Arrays.toString(customers);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(customers);
    }

    @Override
    public void printDetails() {
        if (customers == null) {
            throw new NullPointerException("Array of customers should be initialized");
        }
        out.println("Department's name: " + getName());
        out.println("Contacts: " + getContacts());
        for (Employee employee : getEmployees()) {
            out.println("Name: " + employee.getName() + "Surname: " + employee.getSurname() +
                        "Position: " + employee.getPosition());
        }
    }
}
