package JVM_TTN_Assignments.Multithreading_Assignment.solution_9;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Solution_9 {

    static class DemoTask implements Runnable {
        private final int id;

        DemoTask(int id) {
            this.id = id;
        }

        public void run() {
            try {
                System.out.println(
                    Thread.currentThread().getName() +
                    " -> Task " + id + " started"
                );

                for (int i = 1; i <= 5; i++) {
                    Thread.sleep(1000);
                    System.out.println(
                        Thread.currentThread().getName() +
                        " -> Task " + id + " working step " + i
                    );
                }

                System.out.println(
                    Thread.currentThread().getName() +
                    " -> Task " + id + " completed"
                );

            } catch (InterruptedException e) {
                System.out.println(
                    Thread.currentThread().getName() +
                    " -> Task " + id + " INTERRUPTED"
                );
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("========== shutdown() DEMO ==========");
        ExecutorService executor1 = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 4; i++) {
            executor1.submit(new DemoTask(i));
        }

        Thread.sleep(2000);   // let tasks run
        executor1.shutdown(); // graceful
        System.out.println("shutdown() called");

        while (!executor1.isTerminated()) {
            Thread.sleep(200);
        }

        System.out.println("\n========== shutdownNow() DEMO ==========");
        ExecutorService executor2 = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 4; i++) {
            executor2.submit(new DemoTask(i));
        }

        Thread.sleep(2000); // let tasks run
        List<Runnable> droppedTasks = executor2.shutdownNow(); // forceful
        System.out.println("shutdownNow() called");
        System.out.println("Tasks never started: " + droppedTasks.size());
    }
}

