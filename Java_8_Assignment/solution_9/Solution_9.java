package JVM_TTN_Assignments.Java_8_Assignment.solution_9;

import java.util.*;


class Employee {
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFullName() { return fullName; }
    public Long getSalary() { return salary; }
    public String getCity() { return city; }
}


public class Solution_9 {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Rahul Kumar Singh", 4000L, "delhi"),
                new Employee("Anita Sharma", 3000L, "delhi"),
                new Employee("Rahul Mehta", 4500L, "delhi"),
                new Employee("Vikas Verma", 6000L, "delhi"),
                new Employee("Pooja Jain", 3500L, "mumbai")
        );

        List<String> uniqueFirstNames =
                employees.stream()
                        .filter(e -> e.getSalary() < 5000)
                        .filter(e -> e.getCity().equalsIgnoreCase("delhi"))
                        .map(e -> e.getFullName().split(" ")[0]) // extract first name
                        .distinct()
                        .toList();

        System.out.println(uniqueFirstNames);
    }
}
