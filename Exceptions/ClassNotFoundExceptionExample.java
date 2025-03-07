public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to load a class that doesn't exist
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            // Catching the ClassNotFoundException
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}

