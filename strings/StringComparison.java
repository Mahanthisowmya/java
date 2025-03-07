public class StringComparison {
    public static void main(String[] args) {
        // Define two strings
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";

        // Compare using equals() method
        System.out.println("str1 equals str2: " + str1.equals(str2)); // true
        System.out.println("str1 equals str3: " + str1.equals(str3)); // false (case-sensitive)
    }
}