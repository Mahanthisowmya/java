public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            // Generate an ArithmeticException
            
            // Generate a NullPointerException
            
            // Generate an ArrayIndexOutOfBoundsException
            int[] arr = new int[5];
            arr[10] = 100; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Cannot divide by zero.");
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Cannot call methods on a null object.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index out of bounds.");
        } catch (Exception e) {
            System.out.println("Caught a general Exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exceptions.");
    }
}
