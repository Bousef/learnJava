
//Program to solve the volume of a cuboid and solve for its different sides
// Front and backside = length * height
// Right/Left = breadth * height
// Bottom/top = length * breadth
// Volume = length * breadth * height
import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {

        int length, breadth, height;
        int totalArea, Volume;

        Scanner stdin = new Scanner(System.in);

        length = stdin.nextInt();
        breadth = stdin.nextInt();
        height = stdin.nextInt();

        totalArea = 2 * (length * breadth + length * height + breadth * height);
        Volume = length * breadth * height;

        System.out.println(totalArea);
        System.out.println(Volume);

    }
}
