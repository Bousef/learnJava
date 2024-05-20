public class typeofwebsite {
    public static void main(String[] args) {
        // Find Type of website and the protocol used
        String website = "http://google.com";

        if (website.substring(0, website.indexOf(":")) == "http") {
            System.out.println("Hypertext Transfer Protocol");
        } else if (website.equals("ftp")) {
            System.out.println("File Transfer Protocol");
        }

        String ext = website.substring(website.lastIndexOf("."));

        if (ext.equals("com")) {
            System.out.println("commercial");
        } else if (ext.equals("org")) {
            System.out.println("organization");

        } else if (ext.equals("net")) {
            System.out.println("network");

        }
    }
}
