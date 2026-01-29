package JVM_TTN_Assignments.Java_8_Assignment.solution_2;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

class MathOperations {

    // Instance methods
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    // Static method
    public static int multiply(int a, int b) {
        return a * b;
    }
}


public class Solution_2 {
    public static void main(String[] args) {

        MathOperations obj = new MathOperations();

        // Instance method references
        Calculator addRef = obj::add;
        Calculator subRef = obj::subtract;

        // Static method reference
        Calculator mulRef = MathOperations::multiply;

        System.out.println(addRef.operate(10, 5));   // 15
        System.out.println(subRef.operate(10, 5));   // 5
        System.out.println(mulRef.operate(10, 5));   // 50
    }
}
