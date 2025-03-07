import java.lang.reflect.Method;

public class NoSuchMethodExceptionExample {
    public static void main(String[] args) {
        try {
            // Class with a method named 'existingMethod'
            Class<?> cls = MyClass.class;

            // Attempting to get a non-existent method named 'nonExistentMethod' using reflection
            Method method = cls.getDeclaredMethod("nonExistentMethod");

            // This line won't be reached if NoSuchMethodException occurs
            System.out.println("Method found: " + method.getName());

        } catch (NoSuchMethodException e) {
            // Catching the NoSuchMethodException
            System.out.println("Caught NoSuchMethodException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}

class MyClass {
    // A method that exists in the class
    public void existingMethod() {
        System.out.println("This is the existing method.");
    }
}
