package com.solvd.customer;

import java.util.List;

public interface Payable {
    int TAX_NUMBER = 3423095;
    void initiatePayments();
    String status();
    String getPayment();
}
