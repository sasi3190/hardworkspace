package com.online.JSPServlet;
import java.sql.Connection;
import java.sql.DriverManager;


public class DBUtili {
 
	static Connection con=null;
	public static Connection getConnection(){
	 try{
		 
	 
	 String driver ="com.mysql.jdbc.Driver";
		Class.forName(driver);
		String url ="jdbc:mysql://localhost/MYSQL";
		String username = "sasi";
		String password = "root";
		con = DriverManager.getConnection(url, username, password);
	 }
	 catch(Exception e){e.printStackTrace();}
      return con;
	 }
	}


	 
 


