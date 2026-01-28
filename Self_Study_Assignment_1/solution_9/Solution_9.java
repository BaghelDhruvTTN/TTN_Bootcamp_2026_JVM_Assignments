package solution_9;
class NoStackTraceException extends Exception {

    public NoStackTraceException(String message) {
        super(message);
    }

    // This disables stack trace generation
    public Throwable fillInStackTrace() {
        return this;
    }
}

public class Solution_9 {
    public static void main(String[] args) {
        try {
            throw new NoStackTraceException("This is a custom exception with no stack trace");
        } catch (NoStackTraceException e) {
            e.printStackTrace();  
        }
    }
}
