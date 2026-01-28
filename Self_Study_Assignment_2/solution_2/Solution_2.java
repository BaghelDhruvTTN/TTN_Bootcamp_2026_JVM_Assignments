package JVM_TTN_Assignments.Self_Study_Assignment_2.solution_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;

        try (FileWriter writer = new FileWriter("users.txt", true)) { // true = append mode

            while (true) {

                System.out.print("Enter First Name: ");
                String firstname = sc.nextLine();

                System.out.print("Enter Last Name: ");
                String lastname = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = Integer.parseInt(sc.nextLine());

                System.out.print("Enter Phone Number: ");
                String phone = sc.nextLine();

                // Create user object
                User user = new User(firstname, lastname, age, phone);

                // Write to file
                writer.write(user.toString() + "\n");
                writer.flush();

                System.out.println("User saved successfully.");

                // Ask to continue
                System.out.print("Do you want to continue creating users? (Type QUIT to exit): ");
                choice = sc.nextLine();

                if (choice.equalsIgnoreCase("QUIT")) {
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        sc.close();
        System.out.println("Program ended.");
    }
}


class User {
    private String firstname;
    private String lastname;
    private int age;
    private String phonenumber;

    public User(String firstname, String lastname, int age, String phonenumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.phonenumber = phonenumber;
    }

    public String toString() {
        return firstname + "," + lastname + "," + age + "," + phonenumber;
    }
}

