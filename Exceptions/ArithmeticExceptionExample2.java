public class ArithmeticExceptionExample2 {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            // Attempting division by zero, which may throw an ArithmeticException
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // This block will be executed if an ArithmeticException is thrown
            System.out.println("Error: Cannot divide by zero!");
        }

        System.out.println("Program continues after handling exception.");
    }
}

