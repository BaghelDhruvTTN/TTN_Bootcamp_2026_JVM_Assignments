

/*
You are tasked with writing a processOrderStatus method that takes an OrderStatus enum as input and returns a descriptive string based on the order status.
Here's the OrderStatus enum:

public enum OrderStatus {
    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED,
    REFUNDED
}
Your processOrderStatus method should adhere to the following rules:

For PENDING orders, return: "Order is awaiting confirmation."
For PROCESSING orders, return: "Order is being prepared."
For SHIPPED orders, return: "Order has been dispatched."
For DELIVERED orders, return: "Order has been successfully delivered."
For CANCELLED orders, return: "Order has been canceled."
For REFUNDED orders, return: "Refund has been issued for the order."
Use a single switch expression to achieve this.

Enhancements:

yield Keyword: If your logic requires more complex processing within a case, demonstrate the use of the yield keyword to return a value from the switch expression.
 */
//enum defined
enum OrderStatus {
    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED,
    REFUNDED
}
class EightQues {
    static String processOrderStatus(OrderStatus status){
        return switch(status){
            case PENDING -> "Order is awaiting confirmation.";

            case PROCESSING -> "Order is being prepared.";

            case SHIPPED -> {
                String message = "Order has been dispatched.";
                yield message;
            }
            case DELIVERED -> "Order has been successfully delivered.";

            case CANCELLED -> "Order has been canceled.";

            case REFUNDED ->{
                yield "Refund has been issued for the order.";
            }
            };
        }

    public static void main(String[] args) {
        System.out.println(EightQues.processOrderStatus(OrderStatus.PENDING));
        System.out.println(EightQues.processOrderStatus(OrderStatus.SHIPPED));

    }
}
