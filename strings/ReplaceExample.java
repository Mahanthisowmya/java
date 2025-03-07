public class ReplaceExample {
    public static void main(String[] args) {
        // Original string
        String str = "Hello, World!";

        // Replace 'o' with '0'
        String replacedStr1 = str.replace('o', '0');
        System.out.println("After replacing 'o' with '0': " + replacedStr1);

        // Replace "World" with "Java"
        String replacedStr2 = str.replace("World", "Java");
        System.out.println("After replacing \"World\" with \"Java\": " + replacedStr2);

        // Replace spaces with hyphens
        String replacedStr3 = str.replace(" ", "-");
        System.out.println("After replacing spaces with hyphens: " + replacedStr3);
    }
}
