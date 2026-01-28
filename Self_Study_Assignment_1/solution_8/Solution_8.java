package solution_8;

// A class to demonstrate ClassNotFoundException
class ClassNotFound{
    public static void run() {
        try {
            Class.forName("ImaginaryClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught: " + e);
        }
    }
}

// The Code to demonstrate NoClassDefFoundError
class BrokenClass {
    static {
        // This runs when the class is loaded
        int x = 10 / 0;  // Crash during class loading
    }
}

class NoClassDef {
    public static void run() {
        try {
            new BrokenClass();
        } catch (Throwable t) {
            t.printStackTrace();
        }

        // Try again
        System.out.println("Trying again...");
        new BrokenClass();   // This now causes NoClassDefFoundError
    }
}

public class Solution_8 {
    public static void main(String[] args) {
        ClassNotFound.run();
        NoClassDef.run();
    }
}

