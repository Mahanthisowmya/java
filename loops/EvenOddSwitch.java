import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {
        // Create scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Using switch statement to check if the number is even or odd
        switch (number % 2) {
            case 0:
                System.out.println(number + " is Even.");
                break;
            case 1:
                System.out.println(number + " is Odd.");
                break;
            default:
                System.out.println("Unexpected case.");
        }
        
        sc.close(); // Close the scanner
    }
}
