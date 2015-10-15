package com.online.JSPServlet;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public CreateTable() {
		try{
			// Registering the driver
			String driver = "com.mysql.jdbc.Driver";
			Class.forName(driver);		
			
			
			// Create the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/MYSQL","sasi","root");
			//String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Statement st = con.createStatement();
		//	String username = "sasi";
		//	String password = "root";
		//	Connection con = DriverManager.getConnection(url, username, password);
			
			// Create the statement
			
			
			// executing query
			String query = "create table student(eid number(9), ename varchar(20), epay number(8,2),ebonus number(8,2),uname varchar(20),pwd varchar(20))";
			st.executeUpdate(query);
			
			// processing query
			System.out.println("Table is created in the DB...");
			
			// closing connection
			con.close();
		
		}catch(ClassNotFoundException cf){ 	cf.printStackTrace(); }
		catch(SQLException se){	se.printStackTrace(); 	}
	}
	
	public static void main(String[] args) {
		new CreateTable();
	}

}

