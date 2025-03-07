import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Store the original number to compare later
        int originalNumber = number;

        // Variable to store the sum of the digits raised to the power of the number of digits
        int sum = 0;

        // Find the number of digits in the input number
        int numberOfDigits = String.valueOf(number).length();

        // Calculate the sum of the digits raised to the power of the number of digits
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            sum += Math.pow(digit, numberOfDigits);  // Add the digit raised to the power
            number /= 10;  // Remove the last digit
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }
}
