public class regexChallenge1 {
    // Find if a number is binary or not
    // Find if a Number is Hexa-Decimal or not
    // Find is the data in Date Format (dd/mm/yyyy)
    public static void main(String[] args) {
        int b = 10110001;
        String str = String.valueOf(b); // converts int to string
        String str2 = "8BF";
        String str3 = "31/12/2020";

        System.out.println(str.matches("[01]*"));
        System.out.println(str2.matches("\\w[A-F0-9]*"));
        System.out.println(str3.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }

}
