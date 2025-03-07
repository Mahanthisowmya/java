public class TrimExample {
    public static void main(String[] args) {
        // String with leading and trailing spaces
        String str = "   Hello, World!   ";

        // Display original string
        System.out.println("Original String: \"" + str + "\"");

        // Using trim() to remove spaces
        String trimmedStr = str.trim();

        // Display trimmed string
        System.out.println("Trimmed String: \"" + trimmedStr + "\"");
    }
}
