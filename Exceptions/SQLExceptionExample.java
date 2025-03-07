import java.sql.SQLException;
public class SQLExceptionExample {
    public static void main(String[] args) {
        // Invalid database URL to trigger SQLException
        String dbUrl = "jdbc:mysql://localhost:3306/nonexistentdb";  // Database 'nonexistentdb' does not exist
        String username = "root";
        String password = "password";

        try {
            // Attempting to connect to the non-existent database
        } catch (SQLException e) {
            // Catching the SQLException and printing the error message
            System.out.println("Caught SQLException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}

