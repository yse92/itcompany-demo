package com.solvd.customer;

import com.solvd.contacts.Contacts;

import java.util.List;
import java.util.Random;

import static com.solvd.Main.logger;

public class Customer implements Payable{
    private String name;
    private String surname;
    private Contacts contacts;
    private Status paymentStatus;

    public Customer() {
    }

    public Customer(String name, String surname, Contacts contacts) {
        this.name = name;
        this.surname = surname;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    @Override
    public void initiatePayments() {
        logger.info("Payment has been initiated successfully!");
    }

    @Override
    public String status() {
        return "Payment status is " + paymentStatus;
    }

    @Override
    public String getPayment() {
        Random rnd = new Random();
        int id = rnd.nextInt();
        return "Payment id " + id;
    }
}
