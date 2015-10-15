package com.online.test;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Driver {

	
	public static void main(String[] args) {
		try{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/MYSQL","sasi","root");
			System.out.println("Connection success");
			String query = "select * from usss";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				System.out.println("name:"+rs.getString("ename"));
				
				
			}
		
		
		
	}
		catch(Exception e){
			System.err.println(e);
			
		}

}
}
