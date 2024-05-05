
//Learning to use Arithmetic operators 
//Finding the Area of a triangle 
import java.util.*;

public class area {
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        float base = stdin.nextFloat();
        float height = stdin.nextFloat();

        float area = (1f / 2f) * (base * height);

        System.out.println(area);

    }
}
