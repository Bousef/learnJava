public class regexChallenge2 {
    public static void main(String[] args) {
        // Remove special characters from a string
        // Remove extra spaces from a string
        // Find number of words in a string
        String str = "abc@123!zsfsd%^&*312";
        // You can use regex to find values in a string and replace them/remove them etc
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

        String str2 = "abc   dfg   let   wow";
        String str3 = "   abc   def   gh   ijk    ";
        System.out.println(str2.replaceAll("\\s+", ""));
        String str4 = str3.replaceAll("\\s+", " ").trim();
        String words[] = str4.split("\\s");
        System.out.print(words.length);

    }
}
