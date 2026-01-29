package JVM_TTN_Assignments.Java_8_Assignment.solution_8;

import java.util.Optional;

public class Solution_8 {
    public static void main(String[] args) {

        // 1. Creating Optional
        Optional<String> name = Optional.of("Dhruv");
        Optional<String> empty = Optional.empty();

        // 2. isPresent() and get()
        if (name.isPresent()) {
            System.out.println("Name: " + name.get());
        }

        // 3. orElse() → default value if empty
        System.out.println("Empty orElse: " + empty.orElse("Default Name"));

        // 4. orElseGet() → lazy default (supplier)
        System.out.println("Empty orElseGet: " + empty.orElseGet(() -> "Generated Name"));

        // 5. orElseThrow() → throw exception if value missing
        try {
            empty.orElseThrow(() -> new RuntimeException("Value not found"));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // 6. ifPresent() → run code only if value exists
        name.ifPresent(n -> System.out.println("Length of name: " + n.length()));

        // 7. map() → transform value safely
        Optional<Integer> length = name.map(String::length);
        System.out.println("Mapped length: " + length.orElse(0));
    }
}
