public class stringpractice {
    public static void main(String[] args) {
        // if you have a method or a function which has the same name as the class name
        // its a constructor

        String str1 = "   Java Program    "; // this is called a string literal while str1 is a reference to this

        String str2 = new String("JAVA"); // you can create a string like this as well. (this one will be stored to heap
                                          // due to the new keyword)

        char c[] = { 'a', 'b', 'c', 'd', 'e', 'f' };

        String str3 = new String(c, 1, 3); // you can pass the character array as the parameter
        byte b[] = { 65, 66, 67, 68 }; // by using the ASCII values you can use this byte array to create another
                                       // string
        String str4 = new String(b, 1, 2); // start from index 2 onwards

        String str5 = "Java";
        String str6 = "Java";
        String str = "java";

        System.out.println(str5 == str6); // they hold the same object, java is holding the same object in the pool as
                                          // they are equal
                                          // however if we changed one to "java" it would return false as it is not the
                                          // same string
        String str7 = new String("Java");

        System.out.println(str5 == str7); // returns false since str7 is stored in heap.
        String str15 = "hello";
        // using string methods

        System.out.println(str1.trim());
        System.out.println(str2.length());
        System.out.println(str3.charAt(1));
        System.out.println(str4.toUpperCase());
        System.out.println(str4.toLowerCase());
        System.out.println(str.substring(4));
        System.out.println(str.substring(1, 3));
        System.out.println(str1.concat(str5).trim());
        System.out.println(str1.replace('a', 'p'));
        System.out.println(str1.startsWith("."));
        System.out.println(str1.endsWith("m"));
        System.out.println(str.indexOf('p', 3));
        System.out.println(str.indexOf('p'));
        System.out.println(str.compareTo(str15));
        System.out.println(str.contains("j"));
        // 2 or more methods with the same names are called overloaded methods

        // Regex
        // what are the symbols for regex
        // . - any Character but must be single
        // [abc] - exactly given letters (range of letters)
        // [abc][vz] - either first or second set
        // [^abc] except abc
        // [a-z1-7] - a-z or 1-7
        // A | B - A or B
        // XZ - exactly XZ
        String strExample = "abc";
        System.out.println(strExample.matches("[^abc]"));

        // Meta Characters

        /*
         * \d - digits
         * \D - not digits
         * \s - Space
         * \S - not Space
         * \w - Alphabets or digit
         * \W - Neither alphabet or digit
         */

        System.out.println(strExample.matches("\\w"));
        System.out.println(strExample.matches("\\W"));
        System.out.println(strExample.matches("\\d"));
        System.out.println(strExample.matches("\\D"));
        System.out.println(strExample.matches("\\S"));
        System.out.println(strExample.matches("\\s"));

        // Regex Quantifiers

        /*
         * * - 0 or more time
         * + - one or more
         * ? - 0 or 1 time
         * {X} - X times
         * {X, Y} between x and y time
         * 
         */

        String otherstr = "joh-n@gmail.com";
        System.out.println(otherstr.matches("\\w*gmail(.*)")); // . anything can be there * any number of times

    }
}
