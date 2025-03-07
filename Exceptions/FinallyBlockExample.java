public class FinallyBlockExample {
    
    public static void main(String[] args) {
        try {
            System.out.println("Inside the try block.");

            // Simulating an exception
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            // This block will always execute, regardless of whether an exception was thrown or not
            System.out.println("This is the finally block, it always executes.");
        }

        System.out.println("Program continues after the try-catch-finally.");
    }
}

