package com.solvd.menu;

import com.solvd.company.staff.Position;
import com.solvd.company.staff.Qualification;
import com.solvd.company.staff.Skills;
import com.solvd.company.staff.SoftwareDeveloper;
import com.solvd.exceptions.IncorrectFileNameException;
import com.solvd.utils.FilesUtil;

import java.io.IOException;
import java.util.*;

public class Logic {
    private static final Scanner sc = new Scanner(System.in);

    public void run() throws IOException, IncorrectFileNameException {
        try {
            SoftwareDeveloper softwareDeveloper = getSoftwareDeveloperInfo();
            FilesUtil.writeToTextFile( "test.txt", softwareDeveloper.toString());
        } catch(IOException e) {
            throw new IOException("Incorrect file operation ", e);
        } catch(IncorrectFileNameException e) {
            throw new IncorrectFileNameException("Incorrect file name ", e);
        }
    }

    public Position getPosition() {
        Position position = null;
        try {
            System.out.println("Enter position: ");
            String name = sc.nextLine();
            System.out.println("Enter salary: ");
            float salary = sc.nextFloat();
            sc.nextLine();
            boolean isQuit = true;
            List<String> responsibilities = new ArrayList<>();
            System.out.println("Enter responsibilities: ");
            while (isQuit) {
                String responsibility = sc.nextLine();
                responsibilities.add(responsibility);
                System.out.println("Add more responsibilities? y/n");
                String answer = sc.nextLine();
                if (answer.equals("y")) {
                    String resp = sc.nextLine();
                    responsibilities.add(resp);
                } else if (answer.equals("n")) {
                    isQuit = false;
                }
            }
            String[] buf = new String[responsibilities.size()];
            position = new Position(name, salary, new HashSet<String>(Arrays.asList(buf)));
        } catch (InputMismatchException e) {
            System.out.println("Exception: " + e);
        }
        return position;
    }

    public Qualification getQualififcation() {
        System.out.println("Enter experience: ");
        int experience = sc.nextInt();
        sc.nextLine();
        boolean isQuit = true;
        List<String> education = new ArrayList<>();
        System.out.println("Enter education: ");
        while (isQuit) {
            String edu = sc.nextLine();
            education.add(edu);
            System.out.println("Add more education? y/n");
            String answer = sc.nextLine();
            if (answer.equals("y")) {
                String edu1 = sc.nextLine();
                education.add(edu1);
            } else if (answer.equals("n")) {
                isQuit = false;
            }
        }
        String[] buf = new String[education.size()];
        return new Qualification(experience, education.toArray(buf));
    }

    public Skills getSkills() {
        System.out.println("Enter skills:\n1 - Junior, 2 - Middle, 3 - Senior");
        int answer = sc.nextInt();
        Skills skill = Skills.NEWBIE;
        boolean isQuit = true;
        while(isQuit) {
            switch (answer) {
                case 1:
                    skill = Skills.JUNIOR;
                    isQuit = false;
                    break;
                case 2:
                    skill = Skills.MIDDLE;
                    isQuit = false;
                    break;
                case 3:
                    skill = Skills.SENIOR;
                    isQuit = false;
                    break;
            }
        }
        return skill;
    }

    public SoftwareDeveloper getSoftwareDeveloperInfo() {
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter surname: ");
        String surname = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        Skills skill = getSkills();
        Qualification qualification = getQualififcation();
        Position position = getPosition();
        return new SoftwareDeveloper(age, name, surname, position, qualification, skill);
    }
}
