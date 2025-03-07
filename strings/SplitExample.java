public class SplitExample {
    public static void main(String[] args) {
        // Original string
        String str = "apple,banana,grape,orange";

        // Split the string using "," as the delimiter
        String[] fruits = str.split(",");

        // Display the result
        System.out.println("Splitting string by ',' :");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Another example: splitting by space
        String sentence = "Hello World Java Programming";
        String[] words = sentence.split(" ");

        System.out.println("\nSplitting string by ' ' (space) :");
        for (String word : words) {
            System.out.println(word);
        }
    }
}