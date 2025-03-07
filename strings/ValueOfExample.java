public class ValueOfExample {
    public static void main(String[] args) {
        // Converting different types of numbers to strings
        int numInt = 100;
        double numDouble = 99.99;
        float numFloat = 45.67f;
        long numLong = 123456789L;

        // Using valueOf() to convert numbers to strings
        String strInt = String.valueOf(numInt);
        String strDouble = String.valueOf(numDouble);
        String strFloat = String.valueOf(numFloat);
        String strLong = String.valueOf(numLong);

        // Display results
        System.out.println("Integer to String: " + strInt);
        System.out.println("Double to String: " + strDouble);
        System.out.println("Float to String: " + strFloat);
        System.out.println("Long to String: " + strLong);
    }
}
