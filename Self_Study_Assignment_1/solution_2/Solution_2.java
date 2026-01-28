package solution_2;
import java.util.Scanner;

public class Solution_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        while(!input.equals("XDONE")){
            System.out.println(input);
            input= sc.next();
        }
        sc.close();
        
    }
}
