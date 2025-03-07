import java.util.Scanner;

public class ArithmeticOperations {
    
    // Function to perform arithmetic operations
    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return (num2 != 0) ? num1 / num2 : Double.NaN; // Handle division by zero
            default: 
                System.out.println("Invalid operator");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Performing calculation
        double result = calculate(num1, num2, operator);

        // Displaying result
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error in calculation.");
        }

        scanner.close();
    }
}