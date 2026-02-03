import java.util.ArrayList;
import java.util.List;
/*
Demonstrate the use of  addFirst(), addLast, removeFirst(), removeLast, getFirst(), getLast(), reversed() in Set and List Sequenced collections

 */
public class tenQues {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // addFirst & addLast
        list.addFirst(5);
        list.addLast(40);

        System.out.println(list);

        // getFirst & getLast methods
        System.out.println(list.getFirst()); // 5
        System.out.println(list.getLast());  // 40

        // removeFirst & removeLast methods
        list.removeFirst();
        list.removeLast();

        System.out.println(list); // [10, 20, 30]

        // reversed lidt
        System.out.println(list.reversed()); // [30, 20, 10]
    }
}
