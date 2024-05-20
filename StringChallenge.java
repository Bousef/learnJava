public class StringChallenge {
    public static void main(String[] args) {
        // Email ID is given in the form of a string

        // Find if the email id is on gmail
        // find if username and domain name form email

        String str = "programmer@gmail.com";
        int i = str.indexOf("@"); // grabs the starting index of the domain "@"
        int length = str.length(); // get the length of the string
        String username = str.substring(0, i); // we start from the beginning of the string to i which is the @ symbol
                                               // giving us the username before the domain
        String domain = str.substring(i + 1, length); // this goes from the @ symbol onward by taking in the full length
                                                      // of
        // the string.
        System.out.println(username);
        System.out.println(domain);

        // check if it is gmail or not
        System.out.println(domain.startsWith("gmail"));
    }
}
