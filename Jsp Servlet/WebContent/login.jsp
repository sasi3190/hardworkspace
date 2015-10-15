<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Insert title here</title>
	</head>
	<body>
		<h3 align="center">Login</h3>
		
		<% String msg = request.getParameter("message"); %>

		<% if(msg != null) { %>
			<h5 align="center" style="color:red"><%= msg %></h5>
		<% } %>
		<form action="login" method="post">
			<table align="center">
				<tr>
					<td>User Name</td>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pwd"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Clear"></td>
					<td><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form>
		
	</body>
</html>