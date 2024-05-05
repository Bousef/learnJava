
// Quadratic Equation formula 
// -b + sqrt(b^2 - 4 * a * c)/ 2 * a
// -b - sqrt(b^2 - 4 * a * c)/ 2 * a
import java.util.*;

public class quadraticEquation {
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        int a, b, c;

        a = stdin.nextInt();
        b = stdin.nextInt();
        c = stdin.nextInt();

        int quadraticFormula1 = (-b + (int) Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        int quadraticFormula2 = (-b - (int) Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        System.out.println(quadraticFormula1);
        System.out.println(quadraticFormula2);

    }
}
