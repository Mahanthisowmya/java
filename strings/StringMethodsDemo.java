public class StringMethodsDemo {
    public static void main(String[] args) {
        // Example strings
        String str1 = "Hello World";
        String str2 = "hello world";
        String str3 = "Hello";
        String str4 = "World";

        // 1. equalsIgnoreCase(): Compare strings ignoring case
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("str1 and str2 are equal (ignoring case).");
        } else {
            System.out.println("str1 and str2 are NOT equal.");
        }

        // 2. startsWith(): Check if string starts with a specific prefix
        if (str1.startsWith(str3)) {
            System.out.println("str1 starts with \"" + str3 + "\".");
        } else {
            System.out.println("str1 does NOT start with \"" + str3 + "\".");
        }

        // 3. endsWith(): Check if string ends with a specific suffix
        if (str1.endsWith(str4)) {
            System.out.println("str1 ends with \"" + str4 + "\".");
        } else {
            System.out.println("str1 does NOT end with \"" + str4 + "\".");
        }

        // 4. compareTo(): Compare strings lexicographically
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("str1 and str2 are lexicographically equal.");
        } else if (result > 0) {
            System.out.println("str1 is lexicographically greater than str2.");
        } else {
            System.out.println("str1 is lexicographically smaller than str2.");
        }
    }
}
