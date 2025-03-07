public class ExceptionThrowExample {

    // Method that throws an exception
    public static void throwException() throws Exception {
        throw new Exception("This is a thrown exception.");
    }

    public static void main(String[] args) throws Exception {
        // Calling the method without try-catch block
        throwException();
        System.out.println("This line will not be executed if an exception is thrown.");
    }
}
