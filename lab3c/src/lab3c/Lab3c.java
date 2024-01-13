
package lab3c;
import java.sql.*;

public class Lab3c {

    public static void main(String[] args) {
        // JDBC database URL, username, and password
        String jdbcUrl = "jdbc:mysql://localhost:3306/acd";
        String username = "root";
        String password = "";

        // DDL statement to create a sample table
        String createTableSQL = "CREATE TABLE IF NOT EXISTS employees ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "first_name VARCHAR(50),"
                + "last_name VARCHAR(50),"
                + "age INT"
                + ")";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Create a Statement
            Statement statement = connection.createStatement();

            // Execute the DDL statement
            statement.executeUpdate(createTableSQL);

            System.out.println("Table 'employees' created successfully.");

            // Close the resources
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
