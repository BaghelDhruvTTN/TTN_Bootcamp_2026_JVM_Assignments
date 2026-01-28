package JVM_TTN_Assignments.Self_Study_Assignment_2.solution_1;

enum House {

    VILLA(5000000),
    APARTMENT(2500000),
    BUNGALOW(4000000),
    STUDIO(1500000);

    private int price;

    // Constructor (always private in enums)
    House(int price) {
        this.price = price;
    }

    // Getter method
    public int getPrice() {
        return price;
    }
}


public class Solution_1 {
    public static void main(String[] args) {

        for (House h : House.values()) {
            System.out.println(h + " costs Rs. " + h.getPrice());
        }
    }
}
