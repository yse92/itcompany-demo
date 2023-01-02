package com.solvd.customer;

import java.util.List;

@FunctionalInterface
public interface IValidate {
    boolean validate(Customer customer);
}
