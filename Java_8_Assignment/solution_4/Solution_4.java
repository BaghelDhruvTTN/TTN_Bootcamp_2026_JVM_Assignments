package JVM_TTN_Assignments.Java_8_Assignment.solution_4;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
        System.out.println("Student created: " + name);
    }

    public String getName() {
        return name;
    }
}

@FunctionalInterface
interface StudentFactory {
    Student create(String name);
}


public class Solution_4 {
    public static void main(String[] args) {

        // Constructor reference
        StudentFactory factory = Student::new;

        // Creating object using constructor reference
        Student s1 = factory.create("Dhruv");

        System.out.println("Name from object: " + s1.getName());
    }
}
