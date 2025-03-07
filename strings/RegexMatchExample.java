public class RegexMatchExample {
    public static void main(String[] args) {
        // Define a regex pattern
        String regex = "[a-zA-Z]+";

        // Define test strings
        String testString1 = "HelloWorld";
        String testString2 = "Hello123";

        // Check if the strings match the pattern
        System.out.println(testString1 + " matches regex? " + testString1.matches(regex));
        System.out.println(testString2 + " matches regex? " + testString2.matches(regex));
    }
}
