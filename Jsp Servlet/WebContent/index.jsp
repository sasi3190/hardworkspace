<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Index</title>
	</head>
	<body>
	
		<% String msg = request.getParameter("message"); %>
		
		<% if(msg != null){ %>
			<h4 align="center"><%= msg %></h4>
		<% } %>
		
		<a href="AddEmployee.html">Create</a><br/>
		<a href="login.jsp">login</a>
		
	</body>
</html>