package solution_7;
import java.util.Scanner;

public class Solution_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int a = sc.nextInt();

            System.out.print("Enter another number: ");
            int b = sc.nextInt();

            int result = a / b;   // Can cause ArithmeticException
            System.out.println("Result: " + result);

            int[] arr = {10, 20, 30};
            System.out.println(arr[5]); // Can cause ArrayIndexOutOfBoundsException
        }

        // Multi-catch block
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        }

        // Finally block
        finally {
            System.out.println("Finally block executed: Resources cleaned up.");
            sc.close();
        }

        System.out.println("Program continues normally...");
    }
}

