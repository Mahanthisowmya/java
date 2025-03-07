import java.lang.reflect.Field;

public class NoSuchFieldExceptionExample {
    public static void main(String[] args) {
        try {
            // Class with no field "nonExistentField"
            Class<?> cls = MyClass.class;

            // Attempting to get a non-existent field using reflection
            Field field = cls.getDeclaredField("nonExistentField");

            // This line won't be reached if NoSuchFieldException occurs
            System.out.println("Field found: " + field.getName());

        } catch (NoSuchFieldException e) {
            // Catching the NoSuchFieldException
            System.out.println("Caught NoSuchFieldException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}

class MyClass {
    // A field that is present in the class
}

