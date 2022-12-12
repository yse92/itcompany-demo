package com.solvd.office;

import com.solvd.company.Company;

import java.util.HashMap;
import java.util.Map;

public class Office {
    private Company company;
    private int square;
    private Map<Integer, String> inventory;

    public Office() {
    }

    public Office(Company company, int square, Map<Integer, String> inventory) {
        this.company = company;
        this.square = square;
        this.inventory = inventory;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public Map<Integer, String> getInventory() {
        return inventory;
    }

    public void setInventory(Map<Integer, String> inventory) {
        this.inventory = inventory;
    }

    public void showInventory() {
        for(Map.Entry<Integer, String> item : inventory.entrySet()){
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
    }

}
