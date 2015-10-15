<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>List of Employees</title>
	</head>
	<body>
	<% String user = (String)session.getAttribute("user"); %>
		<h5 align="right">Welcome to <%= user %></h5>
		<% ResultSet rs = (ResultSet)request.getAttribute("resultSet"); %>
		
		<h4 align="center">List of Employees</h4>
		<table border="1" align="center">
			<tr>
				<th>E-ID</th>
				<th>NAME</th>
				<th>PAY</th>
				<th>BONUS</th>
				<th>UserName</th>
				<th></th>
				<th></th>
				   <a href="AddEmployee.html">Create</a><br/>
		            <a href="logout.jsp">login</a><br/>
		            <a href="home.jsp">Home</a><br/>
			</tr>
			<% while(rs.next()){ %>
				<tr>
					<td><%= rs.getInt(1) %></td>
					<td><%= rs.getString("ename") %></td>
					<td><%= rs.getDouble(3) %></td>
					<td><%= rs.getDouble(4) %></td>
					<td><%= rs.getString("uname") %></td>
					<td><a href="edit.jsp?eid=<%=rs.getInt(1)%>&ename=<%=rs.getString(2)%>&epay=<%= rs.getDouble(3) %>&ebonus=<%= rs.getDouble(4) %>&uname=<%= rs.getString("uname") %>">Edit</a></td>
					<td><a href="delete?eid=<%=rs.getInt(1)%>">Delete</a></td>
					
					
		
		
				</tr>
			<%} %>
		</table>
	</body>
</html>