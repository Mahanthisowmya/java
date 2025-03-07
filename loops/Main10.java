import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input the string or number from the user
        System.out.print("Enter a string or number: ");
        String input = scanner.nextLine();

        // Check if the input is a palindrome
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to make the comparison case-insensitive
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        // Check if the string is the same forward and backward
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  // If any characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }

        return true;  // If all characters match, it's a palindrome
    }
}
