package solution_1;

public class Solution_1{
    public static void main(String[] args) {
        Person.getPerson();
        
        // Now to print static variables directly,

        System.out.println("Printing directly through static variables");
        System.out.println(
            "Person's firstname: " + Person.firstName + "\n" +
            "Person's lastname: " + Person.lastName + "\n" +
            "Person's Age: " + Person.age
        );

    }
}

class Person{
    
    static String firstName = "Dhruv";
    static String lastName = "Baghel";
    static int age = 23;
    static{

        System.out.println("In Static Block");
        System.out.println(
            "Person's firstname: " + firstName + "\n" +
            "Person's lastname: " + lastName + "\n" +
            "Person's Age: " + age
        );
        System.out.println();
    }

    public static void getPerson(){
        System.out.println("In Static Method");
        System.out.println(
            "Person's firstname: " + firstName + "\n" +
            "Person's lastname: " + lastName + "\n" +
            "Person's Age: " + age
        );
        System.out.println();
    }
}