public class IncrementDecrement {

    // Method to increment a number
    public static int increment(int num) {
        return num + 1;
    }

    // Method to decrement a number
    public static int decrement(int num) {
        return num - 1;
    }

    public static void main(String[] args) {
        int number = 10;  // Initial number

        System.out.println("Original number: " + number);
        System.out.println("After increment: " + increment(number));
        System.out.println("After decrement: " + decrement(number));
    }
}
