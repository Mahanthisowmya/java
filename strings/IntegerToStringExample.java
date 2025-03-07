public class IntegerToStringExample {
    public static void main(String[] args) {
        // Creating an Integer object
        Integer num = 12345;

        // Method 1: Using String.valueOf()
        String str1 = String.valueOf(num);
        System.out.println("Using valueOf(): " + str1);

        // Method 2: Using Integer.toString()
        String str2 = num.toString();
        System.out.println("Using toString(): " + str2);

        // Method 3: Using concatenation with an empty string
        String str3 = num + "";
        System.out.println("Using concatenation: " + str3);
    }
}
