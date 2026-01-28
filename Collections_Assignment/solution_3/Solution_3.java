package JVM_TTN_Assignments.Collections_Assignment.solution_3;

import java.util.Stack;

class SpecialStack {

    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    // Push operation
    public void push(int value) {
        mainStack.push(value);

        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    // Pop operation
    public int pop() {
        if (mainStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        int removed = mainStack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }

        return removed;
    }

    // getMin operation (O(1))
    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    public boolean isFull() {
        return false; // Dynamic stack, never truly full
    }
}

public class Solution_3 {
    public static void main(String[] args) {

        SpecialStack s = new SpecialStack();

        s.push(10);
        s.push(20);
        s.push(5);
        s.push(8);

        System.out.println("Minimum: " + s.getMin()); // 5

        s.pop(); // removes 8
        s.pop(); // removes 5

        System.out.println("Minimum: " + s.getMin()); // 10
    }
}
