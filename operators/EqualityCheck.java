import java.util.Scanner;

public class EqualityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Checking equality and inequality
        if (num1 == num2) {
            System.out.println("Both numbers are equal.");
        } else {
            System.out.println("Numbers are not equal.");
        }

        scanner.close();
    }
}
