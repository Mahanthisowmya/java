import java.io.File;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            // Create a File object for a file that may not be accessible
            File file = new File("nonexistentfile.txt");

            // Attempting to read from the file using FileReader

            // This line will not be reached if an IOException occurs
            System.out.println("File is read successfully.");

        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}

