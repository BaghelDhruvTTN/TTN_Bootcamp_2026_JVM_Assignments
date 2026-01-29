package JVM_TTN_Assignments.Java_8_Assignment.solution_7;

import java.util.ArrayList;
import java.util.List;

public class Solution_7 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(16);
        list.add(7);
        list.add(8);
        int Sum = list.stream().filter(num -> num>5).mapToInt(Integer:: intValue).sum();
        System.out.println("The Sum of the elements is: "+ Sum);
    }
}
