/*
Create a Record for the student with the following Fields:
id
name
standard

Make sure that no null values are used for initialization.

Use equal and hashCode methods with student records
 */
import java.util.Objects;

record student(int id, String name, String standard) {

    public student {
        Objects.requireNonNull(name, "name cannot be null");
        Objects.requireNonNull(standard, "standard cannot be null");
    }
}

public class nineQues {
    public static void main(String[] args) {

        student s1 = new student(1, "Padam", "10th");
        student s2 = new student(1, "Padam", "10th");

        System.out.println(s1.equals(s2));      // true
        System.out.println(s1.hashCode() == s2.hashCode()); // true
    }
}