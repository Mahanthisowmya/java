public class CustomExceptionExample {
    
    // Method that throws an exception with a custom message
    public static void throwCustomException() throws Exception {
        throw new Exception("This is a custom exception message.");
    }

    public static void main(String[] args) {
        try {
            // Calling the method that throws the exception
            throwCustomException();
        } catch (Exception e) {
            // Catching the thrown exception and printing the custom message
            System.out.println("Caught an exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}
