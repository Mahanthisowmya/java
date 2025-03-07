public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to convert a non-numeric string to an integer
        } catch (NumberFormatException e) {
            // Catching the NumberFormatException and printing the error message
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}

