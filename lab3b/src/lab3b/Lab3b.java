
package lab3b;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Lab3b{
    private JTextField num1TextField;
    private JTextField num2TextField;
    private JLabel resultLabel;
    
    private void createAndShowGUI() {
        JFrame frame = new JFrame("Sum Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2));

        JLabel num1Label = new JLabel("Enter Number 1:");
        num1TextField = new JTextField();

        JLabel num2Label = new JLabel("Enter Number 2:");
        num2TextField = new JTextField();

        JButton calculateButton = new JButton("Calculate Sum");
        calculateButton.addActionListener(new CalculateButtonListener());

        resultLabel = new JLabel("Sum will be displayed here.");

        // Add components to the frame
        frame.add(num1Label);
        frame.add(num1TextField);
        frame.add(num2Label);
        frame.add(num2TextField);
        frame.add(new JLabel()); // Empty cell
        frame.add(calculateButton);
        frame.add(new JLabel()); // Empty cell
        frame.add(resultLabel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Lab3b gui = new Lab3b();
        gui.createAndShowGUI();
    }
    
    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                // Get input values
                double num1 = Double.parseDouble(num1TextField.getText());
                double num2 = Double.parseDouble(num2TextField.getText());

                // Calculate sum
                double sum = num1 + num2;

                // Display the result
                resultLabel.setText("Sum: " + sum);

                // Insert values into the database
                insertIntoDatabase(num1, num2, sum);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input. Please enter valid numbers.");
            }
        }
    }
    private void insertIntoDatabase(double num1, double num2, double sum) {
            String jdbcUrl = "jdbc:mysql://localhost/sum";
            String username = "root";
            String password = "";

            try {
                // Load the MySQL JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish the connection
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

                // Prepare the SQL query to insert values into the 'sum_results' table
                String insertQuery = "INSERT INTO sumresult (num1, num2, sum) VALUES (?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

                // Set parameters for the insert query
                preparedStatement.setDouble(1, num1);
                preparedStatement.setDouble(2, num2);
                preparedStatement.setDouble(3, sum);

                // Execute the insert query
                preparedStatement.executeUpdate();

                // Close the resources
                preparedStatement.close();
                connection.close();
            } catch (ClassNotFoundException | SQLException ex) {
                ex.printStackTrace();
            }
        }
}
