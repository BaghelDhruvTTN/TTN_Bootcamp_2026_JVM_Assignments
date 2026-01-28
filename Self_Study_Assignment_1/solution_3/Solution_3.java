package solution_3;
import java.util.Scanner;

public class Solution_3 {

    public static double calArea(double radius){
        return Math.PI * radius * radius;
    }

    public static double calPerimeter(double radius){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        System.out.println("*******Menu*******");
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Circumference of a Circle");
        System.out.println("3. Exit.");
        System.out.println("Choose an option (1-3): ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        double radius;
        
        switch (choice) {
            case 1:
                System.out.println("Now enter the radius: ");
                radius = sc.nextInt();
                System.out.println("The area of the circle with radius: " + radius + " is " + calArea(radius));
                break;
            
            case 2:
                System.out.println("Now enter the radius: ");
                radius = sc.nextInt();
                System.out.println("The perimeter of the circle with radius: " + radius + " is " + calPerimeter(radius));

            default:
                sc.close();
                break;
        }


    }
}
