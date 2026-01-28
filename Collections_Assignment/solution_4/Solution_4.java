package JVM_TTN_Assignments.Collections_Assignment.solution_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employee {

    private String name;
    private int age;
    private String designation;

    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    // Must override equals()
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
               Objects.equals(name, employee.name) &&
               Objects.equals(designation, employee.designation);
    }

    // Must override hashCode()
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }

    public String toString() {
        return name + " (" + age + ", " + designation + ")";
    }
}

public class Solution_4 {
    
    public static void main(String[] args) {

        Map<Employee, Double> salaryMap = new HashMap<>();

        Employee e1 = new Employee("Dhruv", 23, "Developer");
        Employee e2 = new Employee("Aman", 25, "Tester");
        Employee e3 = new Employee("Neha", 24, "HR");

        // Insert into map
        salaryMap.put(e1, 50000.0);
        salaryMap.put(e2, 45000.0);
        salaryMap.put(e3, 48000.0);

        // Display map entries
        for (Map.Entry<Employee, Double> entry : salaryMap.entrySet()) {
            System.out.println(entry.getKey() + " => Salary: " + entry.getValue());
        }
    }
}
