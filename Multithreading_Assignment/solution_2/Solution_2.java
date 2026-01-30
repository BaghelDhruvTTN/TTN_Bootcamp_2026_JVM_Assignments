package JVM_TTN_Assignments.Multithreading_Assignment.solution_2;

class BankAccount {
    private int balance = 2000;

    // 1) Synchronized method
    public synchronized void withdrawUsingMethod(int amount) {
        System.out.println(Thread.currentThread().getName() + " trying to withdraw " + amount);

        if (balance >= amount) {
            try { Thread.sleep(500); } catch (InterruptedException e) {}
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Insufficient balance!");
        }
    }

    // 2) Method with synchronized block
    public void withdrawUsingBlock(int amount) {
        System.out.println(Thread.currentThread().getName() + " trying to withdraw " + amount);

        synchronized (this) {   // only this critical section is locked
            if (balance >= amount) {
                try { Thread.sleep(500); } catch (InterruptedException e) {}
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " completed withdrawal. Balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " - Insufficient balance!");
            }
        }
    }
}

class Customer extends Thread {
    BankAccount account;

    Customer(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdrawUsingMethod(600);
        account.withdrawUsingBlock(600);
    }
}


public class Solution_2 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Customer t1 = new Customer(account);
        Customer t2 = new Customer(account);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}
