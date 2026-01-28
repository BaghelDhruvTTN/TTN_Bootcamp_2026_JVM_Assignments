package JVM_TTN_Assignments.Self_Study_Assignment_2.solution_5;

class DatabaseConnection {

    // private static instance (single object)
    private static DatabaseConnection instance;

    // private constructor (no one else can create object)
    private DatabaseConnection() {
        System.out.println("DatabaseConnection object created");
    }

    // public method to provide global access point
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to database");
    }
}


public class Solution_5 {
    public static void main(String[] args) {

        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.connect();

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.connect();

        // Proof that both references point to same object
        System.out.println(db1 == db2);
    }
}
