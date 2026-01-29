package JVM_TTN_Assignments.Java_8_Assignment.solution_6;

interface ScienceTool {

    // Default method (belongs to the object)
    default void describe() {
        System.out.println("This is a scientific tool.");
    }

    // Static method (belongs to the interface itself)
    static void category() {
        System.out.println("Category: Knowledge Utilities");
    }
}

class Microscope implements ScienceTool {
    // No need to override describe() unless custom behavior is required
}

public class Solution_6 {
    public static void main(String[] args) {

        Microscope m = new Microscope();

        // Calling default method → through object
        m.describe();

        // Calling static method → through interface name
        ScienceTool.category();
    }
}
