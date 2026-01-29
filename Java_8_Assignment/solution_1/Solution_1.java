package JVM_TTN_Assignments.Java_8_Assignment.solution_1;

// 1. Check whether first number is greater than second
@FunctionalInterface
interface GreaterChecker {
    boolean isGreater(int a, int b);
}

// 2. Increment number by 1
@FunctionalInterface
interface Incrementer {
    int increment(int a);
}

// 3. Concatenation of two strings
@FunctionalInterface
interface StringConcatenator {
    String concat(String s1, String s2);
}

// 4. Convert string to uppercase
@FunctionalInterface
interface ToUpperCaseConverter {
    String toUpper(String s);
}

public class Solution_1 {
    public static void main(String[] args) {

        // 1. Greater check
        GreaterChecker greaterChecker = (a, b) -> a > b;
        System.out.println(greaterChecker.isGreater(10, 5)); // true

        // 2. Increment
        Incrementer incrementer = a -> a + 1;
        System.out.println(incrementer.increment(7)); // 8

        // 3. Concatenation
        StringConcatenator concatenator = (s1, s2) -> s1 + s2;
        System.out.println(concatenator.concat("Hello ", "World")); // Hello World

        // 4. To Uppercase
        ToUpperCaseConverter converter = s -> s.toUpperCase();
        System.out.println(converter.toUpper("lambda is cool")); // LAMBDA IS COOL
    }
}



