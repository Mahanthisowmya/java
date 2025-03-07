import java.util.Scanner;
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Finding the smaller and larger number
        double smaller = (num1 < num2) ? num1 : num2;
        double larger = (num1 > num2) ? num1 : num2;

        // Displaying results
        System.out.println("Smaller number: " + smaller);
        System.out.println("Larger number: " + larger);

        scanner.close();
    }
}
