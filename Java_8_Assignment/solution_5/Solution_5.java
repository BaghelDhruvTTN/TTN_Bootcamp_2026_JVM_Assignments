package JVM_TTN_Assignments.Java_8_Assignment.solution_5;
import java.util.function.*;
public class Solution_5 {
    public static void main(String[] args) {

        // 1. Consumer<T> → takes input, returns nothing
        Consumer<String> printer = s -> System.out.println("Consumed: " + s);
        printer.accept("Hello Lambda");

        // 2. Supplier<T> → takes no input, returns value
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Supplied: " + randomSupplier.get());

        // 3. Predicate<T> → takes input, returns boolean
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));

        // 4. Function<T, R> → transforms input into output
        Function<String, Integer> lengthFinder = s -> s.length();
        System.out.println("Length of 'Lambda': " + lengthFinder.apply("Lambda"));
    }
}
