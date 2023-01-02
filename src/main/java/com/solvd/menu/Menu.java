package com.solvd.menu;

import com.solvd.collections.Generator;
import com.solvd.company.staff.SoftwareDeveloper;
import com.solvd.exceptions.IncorrectFileNameException;
import com.solvd.exceptions.InvalidQualificationException;
import com.solvd.multithreading.CustomThreadPool;
import com.solvd.reflection.Reflection;
import com.solvd.utils.StringCounter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void printMenu() {
        System.out.println("\t\t\t-= IT Company by Yaroslav Moroz =-");
        System.out.println("1. Create software develeopers automatically;");
        System.out.println("2. Create software develeopers manually;");
        System.out.println("3. Count matches using StringUtils;");
        System.out.println("4. Demonstration of reflection;");
        System.out.println("5. Java Interfaces with examples;");
        System.out.println("6. Custom ThreadPool demo;");
        System.out.println("7. Show stream example;");
        System.out.println("8. Exit;");
    }

    public void start() throws IncorrectFileNameException, IOException, InvalidQualificationException {
        if (this.scanner != null) {
            int key;
            ArrayList<SoftwareDeveloper> developers;
            Logic logic = new Logic();
            do {
               printMenu();
                System.out.print("Please select menu item:");
                key = this.scanner.nextInt();
                switch (key) {
                    case 1:
                        developers = Generator.generateSoftwareDevelopers();
                        logic.printDevelopers(developers);
                        break;
                    case 2:
                        developers = logic.getSoftwareDeveloperList();
                        logic.printDevelopers(developers);
                        break;
                    case 3:
                        StringCounter.countWordMatches(
                                new String[]{"Lorem", "has", "and"},
                                "src/main/resources/test2.txt");
                        break;
                    case 4:
                        Reflection.showReflectionExample();
                        break;
                    case 5:
                        Generator.showLambdasExample();
                        break;
                    case 6:
                        CustomThreadPool.executeThreadsDemo(7);
                        break;
                    case 7:
                        Generator.showStreamsExample();
                        break;
                    default:
                        System.out.println("You entered an invalid menu value...\n");
                }
            } while (key != 8);
        }
    }
}
