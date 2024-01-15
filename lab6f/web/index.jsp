<%-- 
    Document   : index
    Created on : Jan 15, 2024, 3:18:26 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%
    // Get the current time
    Calendar calendar = Calendar.getInstance();
    Date now = calendar.getTime();

    // Set the format for comparison
    SimpleDateFormat sdf = new SimpleDateFormat("HH");
    String formattedTime = sdf.format(now);

    // Convert the formatted time to an integer
    int currentHour = Integer.parseInt(formattedTime);

    // Display "Good Morning" or "Good Evening" based on the current time
    if (currentHour >= 0 && currentHour < 12) {
        out.println("Good Morning!");
    } else {
        out.println("Good Evening!");
    }
%>