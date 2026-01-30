package JVM_TTN_Assignments.Multithreading_Assignment.solution_1;

class MyRunnable implements Runnable {

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Runnable Thread: " + i);
                Thread.sleep(500); // pauses for 500 ms
            }
        } catch (InterruptedException e) {
            System.out.println("Runnable interrupted");
        }
    }
}

class MyThread extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread Class: " + i);
                Thread.sleep(500); 
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class Solution_1 {
    public static void main(String[] args) {

        // Using Runnable
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable);

        // Using Thread class
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

        try {
            // main thread waits for both threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread ends after both threads complete.");
    }
}
