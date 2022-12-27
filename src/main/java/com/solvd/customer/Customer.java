package com.solvd.customer;

import com.solvd.utils.RandomDigitGenerator;
import com.solvd.contacts.Contacts;

import static com.solvd.Main.logger;

public class Customer implements Payable{
    private String name;
    private String surname;
    private Contacts contacts;
    private Status paymentStatus;

    public Customer(String name, String surname, Contacts contacts) {
        this.name = name;
        this.surname = surname;
        this.contacts = contacts;
    }

    public Customer(String name, String surname, Contacts contacts, Status paymentStatus) {
        this.name = name;
        this.surname = surname;
        this.contacts = contacts;
        this.paymentStatus = paymentStatus;
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

    public Status getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Status paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public void initiatePayments() {
        logger.info("Payment has been initiated successfully!");
    }

    @Override
    public String status() {
        return getPaymentStatus().toString();
    }

    @Override
    public Integer getPayment() {
        RandomDigitGenerator randomDigitGenerator = new RandomDigitGenerator();
        return randomDigitGenerator.get();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", \ncontacts=" + contacts.toString() +
                ", \npaymentStatus=" + paymentStatus +
                "}\n";
    }
}
