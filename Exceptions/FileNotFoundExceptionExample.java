import java.io.File;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Creating a File object with a non-existent file path
            File file = new File("nonexistentfile.txt");

            // Trying to read from the file using Scanner

            // This line will not be reached if the file is not found
            System.out.println("File is found and read successfully.");

        } catch (FileNotFoundException e) {
            // Catching the FileNotFoundException and printing the error message
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}

