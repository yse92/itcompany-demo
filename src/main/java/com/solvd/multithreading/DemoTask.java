package com.solvd.multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoTask implements Runnable {
    private String taskName;

    public DemoTask(String taskName) {
        this.taskName = taskName;
    }
//    @Override
//    public void run() {
//        System.out.println("Task " + taskName + " is running");
//    }
    @Override
    public void run() {
        try {
//            synchronized ("resource") {
                for (int j = 0; j <= 5; j++) {
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
                    if (j == 0) {
                        System.out.println("Init time for the task "+ taskName + " = " + sdf.format(dt));
                    } else {
                        System.out.println("Execution time for the task " + taskName + " = " + sdf.format(dt));
                    }
                    Thread.sleep(490);
                }
                System.out.println("Task " + taskName + " is complete.");
//            }
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
