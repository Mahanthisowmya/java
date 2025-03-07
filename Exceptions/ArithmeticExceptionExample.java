public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        // This will generate an ArithmeticException
        int result = numerator / denominator;  // Division by zero

        System.out.println("Result: " + result);
    }
}
