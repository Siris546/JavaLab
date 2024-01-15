<%-- 
    Document   : index
    Created on : Jan 15, 2024, 3:03:59 PM
    Author     : user
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*,java.util.*" %>

<%
    // Database connection parameters
    String jdbcUrl = "jdbc:mysql://localhost:3306/acd";
    String dbUser = "root";
    String dbPassword = "";

    try {
        // Load the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish a connection
        Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);

        // Create a statement
        Statement statement = connection.createStatement();

        // Insert operation
        String insertQuery = "INSERT INTO users (id, username, password) VALUES (1, 'john', 'password123')";
        int rowsInserted = statement.executeUpdate(insertQuery);
        out.println("Rows Inserted: " + rowsInserted + "<br>");

        // Select operation
        String selectQuery = "SELECT * FROM users";
        ResultSet resultSet = statement.executeQuery(selectQuery);
        while (resultSet.next()) {
            out.println("ID: " + resultSet.getInt("id") + ", Username: " + resultSet.getString("username") + "<br>");
        }

        // Update operation
        String updateQuery = "UPDATE users SET password='newpassword' WHERE username='john'";
        int rowsUpdated = statement.executeUpdate(updateQuery);
        out.println("Rows Updated: " + rowsUpdated + "<br>");

        // Delete operation
        String deleteQuery = "DELETE FROM users WHERE username='john'";
        int rowsDeleted = statement.executeUpdate(deleteQuery);
        out.println("Rows Deleted: " + rowsDeleted + "<br>");

        // Close resources
        resultSet.close();
        statement.close();
        connection.close();
    } catch (ClassNotFoundException e) {
        out.println("Exception: " + e.getMessage());
    }
    catch (SQLException e){
        out.print("Exception: " + e.getMessage());
    }
%>