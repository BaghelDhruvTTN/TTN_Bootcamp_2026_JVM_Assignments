package JVM_TTN_Assignments.Multithreading_Assignment.solution_3;

public class Solution_3 {

        private static volatile boolean running = true; // Removing volatile keyword will lead to never ending 'busy-wait' loop even on updation of the variable.

        static class Worker extends Thread {
            @Override
            public void run() {
                System.out.println("Worker thread started...");
    
                while (running) {
                    // busy-wait loop
                }
    
                System.out.println("Worker thread stopped.");
            }
        }
    
        public static void main(String[] args) throws InterruptedException {
    
            Worker t = new Worker();
            t.start();
    
            Thread.sleep(2000); 
    
            System.out.println("Main thread changing running = false");
            running = false;
        }
}
