public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        // Creating an array of size 5
        int[] arr = new int[5];

        // This will generate an ArrayIndexOutOfBoundsException
        // Trying to access index 10, which is out of bounds (array size is 5)
        arr[10] = 100;  

        System.out.println("Array value: " + arr[10]);
    }
}

