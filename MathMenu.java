import java.util.*;

public class MathMenu {

    // make a math menu involving arithmetic operations
    public static void main(String[] args) {
        int x, y, total = 0;
        String Operations;

        Scanner stdin = new Scanner(System.in);
        System.out.println("What are the two numbers you want to use?: ");
        x = stdin.nextInt();
        y = stdin.nextInt();
        stdin.nextLine();
        System.out.println("What Operation: ADD DIV SUB MOD MULTI");
        Operations = stdin.nextLine();

        switch (Operations.toUpperCase()) {
            case "ADD":
                total = x + y;
                break;
            case "SUB":
                total = x - y;
                break;
            case "DIV":
                total = x / y;
                break;
            case "MULTI":
                total = x * y;
                break;
            case "MOD":
                total = x % y;
                break;

            default:
                break;
        }

        System.out.println(total);
        stdin.close();
    }

}
