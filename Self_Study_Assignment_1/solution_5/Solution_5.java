package solution_5;
class Employee {

    // Fields (instance variables)
    private String firstname;
    private String lastname;
    private int age;
    private String designation;

    // Non-parameterized constructor
    public Employee() {
        this.firstname = "";
        this.lastname = "";
        this.age = 0;
        this.designation = "";
    }

    // Parameterized constructor
    public Employee(String firstname, String lastname, int age, String designation) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.designation = designation;
    }

    // Copy constructor
    public Employee(Employee other) {
        this.firstname = other.firstname;
        this.lastname = other.lastname;
        this.age = other.age;
        this.designation = other.designation;
    }

    // Setter methods
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Overriding toString()
    public String toString() {
        return "Employee Details: " +
               "Name = " + firstname + " " + lastname +
               ", Age = " + age +
               ", Designation = " + designation;
    }
}

public class Solution_5 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Dhruv", "Baghel", 23, "Software Developer Intern");
        System.out.println(e1);

        Employee e2 = new Employee();
        e2.setFirstname("Ashish");
        e2.setLastname("Chopra");
        e2.setAge(30); // not to be taken seriously :)
        e2.setDesignation("Mentor");

        System.out.println(e2);
    }
}