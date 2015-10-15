<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<title>Home Sweet Home</title>
	</head>
	<body>
	
		<%// String user = request.getParameter("user"); %>
		<% String user = (String)session.getAttribute("user"); %>
		<h5 align="right">Welcome to <%= user %></br><a href="logout.jsp">logout</a></h5>
		
		<a href="view">View Employees</a></br>
		<a href="login.jsp">Re-Login page for Employees</a></br>
		
	</body>
</html>