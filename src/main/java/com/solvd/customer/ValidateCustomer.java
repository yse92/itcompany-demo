package com.solvd.customer;

import java.util.ArrayList;
import java.util.List;

public class ValidateCustomer {
    public static List<Customer> validate(List<Customer> customers, IValidate predicate) {
        List<Customer> validatedCustomers = new ArrayList<>();
        customers.forEach(customer -> {
            if (predicate.validate(customer)) {
                validatedCustomers.add(customer);
            }
        });
        return validatedCustomers;
    }
}
