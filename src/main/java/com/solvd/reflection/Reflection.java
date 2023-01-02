package com.solvd.reflection;

import com.solvd.collections.Generator;
import com.solvd.company.project.Meeting;
import com.solvd.company.staff.Employee;
import com.solvd.company.staff.SoftwareDeveloper;
import com.solvd.customer.Customer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;

public class Reflection {
    public static void printField(Object someClass, String field) {
        try {
            Field targetField = someClass.getClass().getDeclaredField(field);
            System.out.println(targetField);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
    public static void invokeMethod(Object someClass, String method, Object... args) {
        try {
            Class<?>[] params = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                if (args[i] instanceof Integer) {
                    params[i] = Integer.TYPE;
                } else if (args[i] instanceof String) {
                    params[i] = String.class;
                } else if (args[i] instanceof Employee) {
                    params[i] = Employee.class;
                }
            }
            Method targetMethod = someClass.getClass().getDeclaredMethod(method, params);
            targetMethod.setAccessible(true);
            targetMethod.invoke(someClass, args);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public static void printAllMethods(Object someClass) {
        Method[] declaredMethods = someClass.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
    }
    public static void printAllFields(Object someClass) {
        Field[] declaredFields = someClass.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
    }
    public static void showReflectionExample() {
        Meeting meeting = Generator.generateMeeting();
        ArrayList<SoftwareDeveloper> developers = Generator.generateSoftwareDevelopers();
        //get private fields
        Reflection.printField(meeting, "participants");
        System.out.println("-------------------------------------");
        //invoke private method
        Reflection.invokeMethod(meeting, "addParticipant", developers.get(0));
        System.out.println("-------------------------------------");
        Reflection.printAllMethods(developers.get(0));
    }
}
