<%-- 
    Document   : success
    Created on : Jan 15, 2024, 1:40:44 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*" %>
<%@ page import="javax.servlet.*,javax.servlet.http.*" %>

<%
    // Get the username and password from the request
    String enteredUsername = request.getParameter("username");
    String enteredPassword = request.getParameter("password");

    String validUsername = "user";
    String validPassword = "password";

    // Validate credentials
    if (enteredUsername.equals(validUsername) && enteredPassword.equals(validPassword)) {
        // Successful login
%>
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Login Successful</title>
        </head>
        <body>
            <h2>Login Successful!</h2>
        </body>
        </html>
<%
    } else {
        // Failed login
%>
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Login Failed</title>
        </head>
        <body>
            <h2>Login Failed. Please try again.</h2>
        </body>
        </html>
<%
    }
%>

