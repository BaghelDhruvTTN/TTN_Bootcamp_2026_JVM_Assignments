/*
Use a Sealed class Class concept to create a class hierarchy.
Mark Child classes as final, sealed, and non sealed and observe their behavior
 */
//sealed class that permit 3 class
sealed class Calculator permits Addition, Subtraction, Multiplication {

    public void calculate() {
        System.out.println("Calculating...");
    }
}
// first class that extends calculator
final class Addition extends Calculator {
    public void add(int a, int b) {
        System.out.println(a + b);
    }
}
//second class with sealed keyword that extends calculator and also permits AdvanceSubtraction
sealed class Subtraction extends Calculator permits AdvancedSubtraction {
    public void sub(int a, int b) {
        System.out.println(a - b);
    }
}
//non sealed class that implements calculator
non-sealed class Multiplication extends Calculator {
    public void multiply(int a, int b) {
        System.out.println(a * b);
    }
}

final class AdvancedSubtraction extends Subtraction {
    public void sub(int a, int b, int c) {
        System.out.println(a - b - c);
    }
}

public class sixQues {
    public static void main(String[] args) {
        Calculator c1 = new Addition();
        Calculator c2 = new Subtraction();
        Calculator c3 = new Multiplication();

        ((Addition) c1).add(10, 5);
        ((Subtraction) c2).sub(10, 5);
        ((Multiplication) c3).multiply(10, 5);

    }
}
