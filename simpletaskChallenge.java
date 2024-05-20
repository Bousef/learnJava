public class simpletaskChallenge {
    public static void main(String[] args) {
        // Find a number is odd or even
        // find person is young or not young
        // find grades for given marks

        int num = 5;
        int age = 50;
        float grades = 90.00f;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        if (age <= 40) {
            System.out.println("You are a Young");
        } else {
            System.out.println("You are old");
        }

        if (grades >= 90.00) {
            System.out.println("A");

        } else if (grades <= 89.9 && grades >= 80.00) {
            System.out.println("B");
        } else if (grades <= 79.99 && grades >= 70) {
            System.out.println("C");

        } else if (grades <= 69.99 && grades >= 60) {
            System.out.println("D");

        } else {
            System.out.println("F");

        }

    }
}
