public class StringIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            // Trying to access a character at an invalid index
        } catch (StringIndexOutOfBoundsException e) {
            // Catching the StringIndexOutOfBoundsException and printing the error message
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}

