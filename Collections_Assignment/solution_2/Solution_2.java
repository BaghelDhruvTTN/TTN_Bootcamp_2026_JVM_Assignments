package JVM_TTN_Assignments.Collections_Assignment.solution_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Employee implements Comparable<Employee> {

    private String firstName;
    private String lastName;
    private Double age;
    private Double salary;

    public Employee(String firstName, String lastName, Double age, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public int compareTo(Employee other) {
        // First compare by first name
        int firstCompare = this.firstName.compareToIgnoreCase(other.firstName);

        // If first names are same, compare by last name
        if (firstCompare == 0) {
            return this.lastName.compareToIgnoreCase(other.lastName);
        }

        return firstCompare;
    }

    public String toString() {
        return firstName + " " + lastName + " | Age: " + age + " | Salary: " + salary;
    }
}


class SalaryComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e1.getSalary().compareTo(e2.getSalary());
    }
}



public class Solution_2 {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Dhruv", "Baghel", 23.0, 50000.0));
        employees.add(new Employee("Aman", "Sharma", 25.0, 45000.0));
        employees.add(new Employee("Dhruv", "Verma", 28.0, 60000.0));
        employees.add(new Employee("Neha", "Gupta", 24.0, 48000.0));

        System.out.println("Default Sorting (FirstName, then LastName):");
        Collections.sort(employees);
        employees.forEach(System.out::println);

        System.out.println("\nSorting by Salary:");
        Collections.sort(employees, new SalaryComparator());
        employees.forEach(System.out::println);
    }
}

