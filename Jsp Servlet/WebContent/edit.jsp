<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<% String user = (String)session.getAttribute("user"); %>
		<h5 align="right">Welcome to <%= user %></h5>
		
		<%
		String eid = request.getParameter("eid");
		String Name = request.getParameter("ename");
		String Pay = request.getParameter("epay");
		String Bonus = request.getParameter("ebonus");
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		%>
		
		<h3 align="center">Edit Employee</h3>
		
		<form action="edit" method="post">
		  <input type="hidden" name="eid" value="<%=eid%>"> 
			<table align="center">
				<tr>
					<td>E-ID</td>
					<td><input type="text" value="<%=eid%>" disabled="disabled"/></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="ename" value="<%=Name%>"></td>
				</tr>
				<tr>
					<td>Pay</td>
					<td><input type="text" name="epay" value="<%= Pay %>"></td>
				</tr>
				<tr>
					<td>Bonus</td>
					<td><input type="text" name="ebonus" value="<%= Bonus %>"></td>
				</tr>
				<tr>
					<td>user name</td>
					<td><input type="text" name="uname" value="<%= uname %>"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pwd" value="<%=pwd%>"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Clear"></td>
					<td><input type="submit" value="Update"></td>
				</tr>
			</table>
		</form>
	</body>
</html>