import java.util.Scanner;

public class GenderSwitch {
    public static void main(String[] args) {
        // Create scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);  // Read the first character of input
        
        // Using switch statement to determine gender
        switch (gender) {
            case 'M':
            case 'm':
                System.out.println("Gender: Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Gender: Female");
                break;
            default:
                System.out.println("Invalid input. Please enter M for Male or F for Female.");
        }
        
        sc.close(); // Close the scanner
    }
}
