package JVM_TTN_Assignments.Multithreading_Assignment.solution_8;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution_8 {

    static class RandomNumberTask implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            Thread.sleep(1000); // simulate computation
            int randomNumber = new Random().nextInt(100); // 0–99
            System.out.println("Generated number: " + randomNumber);
            return randomNumber;
        }
    }

    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(new RandomNumberTask());

        try {
            System.out.println("Main thread waiting for result...");
            Integer result = future.get(); // blocks until value is ready
            System.out.println("Received from Future: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}

