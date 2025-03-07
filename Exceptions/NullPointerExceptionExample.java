public class NullPointerExceptionExample {
    public static void main(String[] args) {
        // Declare an object reference but do not initialize it
        try {
            // Attempting to call a method on a null object reference
        } catch (NullPointerException e) {
            // Catching the NullPointerException and printing the error message
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}

