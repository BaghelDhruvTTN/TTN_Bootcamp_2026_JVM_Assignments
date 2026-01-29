package JVM_TTN_Assignments.Java_8_Assignment.solution_3;

interface Teacher {
    default void role() {
        System.out.println("I teach students.");
    }
}

interface Developer {
    default void role() {
        System.out.println("I write code.");
    }
}

class Person implements Teacher, Developer {

    public void role() {
        // You can choose one
        Teacher.super.role();

        // Or the other
        Developer.super.role();

        // Or define your own meaning entirely
        System.out.println("I teach, I code, I adapt.");
    }
}

public class Solution_3 {
    public static void main(String[] args) {
        Person p = new Person();
        p.role();
    }
}
