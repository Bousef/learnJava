import java.util.*;

public class nameDay {
    public static void main(String[] args) {
        // Display name of a day based on a number
        Scanner stdin = new Scanner(System.in);
        System.out.println("Type a number 1-7");
        int dayOfWeek = stdin.nextInt();

        if (dayOfWeek == 1) {
            System.out.println("Sunday");

        } else if (dayOfWeek == 2) {
            System.out.println("Monday");

        } else if (dayOfWeek == 3) {
            System.out.println("Tuesday");

        } else if (dayOfWeek == 4) {
            System.out.println("Wednesday");

        } else if (dayOfWeek == 5) {
            System.out.println("Thursday");

        } else if (dayOfWeek == 6) {
            System.out.println("Friday");

        } else if (dayOfWeek == 7) {
            System.out.println("Saturday");

        } else {
            System.out.println("Not a valid input");
        }
    }

}
