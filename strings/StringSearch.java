public class StringSearch {
    public static void main(String[] args) {
        // Declare a string
        String str = "Hello, World! Welcome to Java programming.";

        // Search for a substring
        int index1 = str.indexOf("World");
        System.out.println("Index of 'World': " + index1);

        // Search for a character
        int index2 = str.indexOf('W');
        System.out.println("Index of 'W': " + index2);

        // Search for a substring that doesn't exist
        int index3 = str.indexOf("Python");
        System.out.println("Index of 'Python': " + index3); // Returns -1 if not found

        // Search from a specific index
        int index4 = str.indexOf("o", 5); // Starts searching from index 5
        System.out.println("Index of 'o' after index 5: " + index4);
    }
}
