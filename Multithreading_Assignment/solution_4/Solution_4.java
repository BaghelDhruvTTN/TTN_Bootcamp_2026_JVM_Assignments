package JVM_TTN_Assignments.Multithreading_Assignment.solution_4;

public class Solution_4 {
    
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    static class ThreadA extends Thread {
        public void run() {
            synchronized (resource1) {
                System.out.println("Thread A locked resource1");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread A waiting for resource2");
                synchronized (resource2) {
                    System.out.println("Thread A locked resource2");
                }
            }
        }
    }

    static class ThreadB extends Thread {
        public void run() {
            synchronized (resource2) {
                System.out.println("Thread B locked resource2");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread B waiting for resource1");
                synchronized (resource1) {
                    System.out.println("Thread B locked resource1");
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();

        t1.start();
        t2.start();
    }
}
