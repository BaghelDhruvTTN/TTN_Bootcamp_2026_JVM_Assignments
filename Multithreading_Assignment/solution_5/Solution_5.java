package JVM_TTN_Assignments.Multithreading_Assignment.solution_5;

import java.util.concurrent.*;

// Runnable task: cannot return a value
class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Runnable is running...");
    }
}

// Callable task: returns a value
class MyCallable implements Callable<Integer> {

    public Integer call() throws Exception {
        System.out.println("Callable is running...");
        return 42;
    }
}

public class Solution_5 {
    public static void main(String[] args) throws Exception {

        // Create executor service
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Runnable usage
        Runnable runnableTask = new MyRunnable();
        executor.execute(runnableTask);

        // Callable usage
        Callable<Integer> callableTask = new MyCallable();
        Future<Integer> future = executor.submit(callableTask);

        // Getting result from Callable
        Integer result = future.get();
        System.out.println("Result from Callable: " + result);

        executor.shutdown();
    }
}
