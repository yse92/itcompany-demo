package com.solvd.multithreading;

import java.util.LinkedList;

public class CustomThreadPool {
    private WorkerThread[] threads;
    private LinkedList<Runnable> taskQueue;

    public CustomThreadPool(int threadNumber) {
        taskQueue = new LinkedList<>();
        threads = new WorkerThread[threadNumber];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new WorkerThread();
            threads[i].start();
        }
    }
    public void execute(Runnable task) {
        synchronized (taskQueue) {
            //insert element and notify all waiting threads
            taskQueue.add(task);
            taskQueue.notify();
        }
    }


    public class WorkerThread extends Thread{
        public void run() {
            Runnable r;
            while (true) {
                synchronized (taskQueue) {
                    while(taskQueue.isEmpty()) {
                        try {
                            //waits if element is available or not
                            taskQueue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    r = (Runnable) taskQueue.removeFirst();
                }
                try {
                    //execute task with current thread
                    r.run();
                } catch (Exception ex) {
                    System.out.println("Exception: " + ex);
                }
            }
        }
    }

    public static void executeThreadsDemo(int num) {
        CustomThreadPool pool = new CustomThreadPool(7);

        for(int i = 0; i < num; i++) {
            DemoTask task = new DemoTask(String.valueOf(i));
            pool.execute(task);
        }
    }
}
