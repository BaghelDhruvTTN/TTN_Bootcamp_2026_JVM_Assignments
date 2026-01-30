package JVM_TTN_Assignments.Multithreading_Assignment.solution_7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution_7 {

    static class Task implements Runnable {
        private final int id;

        Task(int id) {
            this.id = id;
        }

        public void run() {
            try {
                System.out.println(
                    Thread.currentThread().getName() +
                    " -> Task " + id + " started"
                );
                Thread.sleep(1000);
                System.out.println(
                    Thread.currentThread().getName() +
                    " -> Task " + id + " finished"
                );
            } catch (InterruptedException e) {
                System.out.println(
                    Thread.currentThread().getName() +
                    " -> Task " + id + " interrupted"
                );
            }
        }
    }

    private static void runExecutor(String label, ExecutorService executor)
            throws InterruptedException {

        System.out.println("\n========== " + label + " ==========");

        List<Future<?>> futures = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {
            futures.add(executor.submit(new Task(i)));
        }

        // wait for all tasks
        for (Future<?> f : futures) {
            try {
                f.get(); // blocks until task completes
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        System.out.println(label + " -> All tasks completed");
    }

    public static void main(String[] args) throws InterruptedException {

        runExecutor(
            "SingleThreadExecutor",
            Executors.newSingleThreadExecutor()
        );

        runExecutor(
            "CachedThreadPool",
            Executors.newCachedThreadPool()
        );

        runExecutor(
            "FixedThreadPool (3 threads)",
            Executors.newFixedThreadPool(3)
        );
    }
}

