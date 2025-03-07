public class Main4 {

    public static void main(String[] args) {
        // Print even numbers
        System.out.println("Even numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Print odd numbers
        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
