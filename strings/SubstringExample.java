public class SubstringExample {
    public static void main(String[] args) {
        // Declare a string
        String str = "Hello, World!";

        // Extract substring from index 7 to the end
        String subStr1 = str.substring(7);
        System.out.println("Substring from index 7: " + subStr1);

        // Extract substring from index 0 to 5 (excluding index 5)
        String subStr2 = str.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + subStr2);
    }
}
