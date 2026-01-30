package JVM_TTN_Assignments.Multithreading_Assignment.solution_6;

import java.util.concurrent.locks.ReentrantLock;

public class Solution_6 {
    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();

    static class ThreadA extends Thread {
        public void run() {
            while (true) {
                if (lock1.tryLock()) {
                    try {
                        System.out.println("Thread A locked lock1");
                        Thread.sleep(100);

                        if (lock2.tryLock()) {
                            try {
                                System.out.println("Thread A locked lock2");
                                break;
                            } finally {
                                lock2.unlock();
                            }
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock1.unlock();
                    }
                }
            }
            System.out.println("Thread A finished safely");
        }
    }

    static class ThreadB extends Thread {
        public void run() {
            while (true) {
                if (lock2.tryLock()) {
                    try {
                        System.out.println("Thread B locked lock2");
                        Thread.sleep(100);

                        if (lock1.tryLock()) {
                            try {
                                System.out.println("Thread B locked lock1");
                                break;
                            } finally {
                                lock1.unlock();
                            }
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock2.unlock();
                    }
                }
            }
            System.out.println("Thread B finished safely");
        }
    }

    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();

        t1.start();
        t2.start();
    }
}
