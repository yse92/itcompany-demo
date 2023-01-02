package com.solvd;

import com.solvd.collections.Generator;
import com.solvd.company.department.DevelopmentDepartment;
import com.solvd.company.department.SalesDepartment;
import com.solvd.company.project.Meeting;
import com.solvd.company.project.Task;
import com.solvd.company.staff.*;
import com.solvd.contacts.Contacts;
import com.solvd.customer.Customer;
import com.solvd.customer.Status;
import com.solvd.exceptions.IncorrectFileNameException;
import com.solvd.exceptions.InvalidQualificationException;
import com.solvd.menu.Logic;
import com.solvd.menu.Menu;
import com.solvd.multithreading.CustomThreadPool;
import com.solvd.multithreading.DemoTask;
import com.solvd.reflection.Reflection;
import com.solvd.utils.Printer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IncorrectFileNameException, IOException, InvalidQualificationException {
        new Menu(new Scanner(System.in)).start();
    }
}
