public class CustomExceptionExample2 {

    // Method that throws the custom exception
    public static void checkAge(int age) throws MyCustomException {
        if (age < 18) {
            throw new MyCustomException("Age must be 18 or older. You provided: " + age);
        }
        System.out.println("You are eligible!");
    }

    public static void main(String[] args) {
        try {
            // Trying to call the method with an invalid age
            checkAge(15);
        } catch (MyCustomException e) {
            // Catching the custom exception and printing the message
            System.out.println("Caught an exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}

// Custom Exception class
class MyCustomException extends Exception {
    // Constructor to pass a custom message to the Exception
    public MyCustomException(String message) {
        super(message);  // Pass the message to the parent class (Exception)
    }
}

