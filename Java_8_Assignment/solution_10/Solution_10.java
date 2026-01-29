package JVM_TTN_Assignments.Java_8_Assignment.solution_10;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.ZonedDateTime;
import java.time.ZoneId;

class DateComparisonDemo {

    public static void run() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-mm-dd): ");
        String d1 = sc.nextLine();

        System.out.print("Enter second date (yyyy-mm-dd): ");
        String d2 = sc.nextLine();

        LocalDate date1 = LocalDate.parse(d1);
        LocalDate date2 = LocalDate.parse(d2);

        if (date1.isBefore(date2)) {
            System.out.println("First date occurs BEFORE second date");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date occurs AFTER second date");
        } else {
            System.out.println("Both dates are EQUAL");
        }
        sc.close();
    }
}


class TimeZoneDemo {

    public static void run() {

        ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usa = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime japan = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("India Time   : " + india);
        System.out.println("New York Time: " + usa);
        System.out.println("Japan Time   : " + japan);
    }
}


public class Solution_10 {
    public static void main(String[] args) {
        DateComparisonDemo.run();
        TimeZoneDemo.run();
    }
}
