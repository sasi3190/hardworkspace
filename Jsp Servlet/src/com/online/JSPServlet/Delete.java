package com.online.JSPServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int no = Integer.parseInt(request.getParameter("eid"));
		
		try{
			/*String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "system";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);
			-----MY SQL Connection
			String driver ="com.mysql.jdbc.Driver";
			Class.forName(driver);
			String url ="jdbc:mysql://localhost/MYSQL";
			String username = "sasi";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);*/
			//----ServletContext - global to entire application
			ServletContext context = getServletContext();
			String driver =context.getInitParameter("driver");
			Class.forName(driver);
			String url =context.getInitParameter("url");
			String username = context.getInitParameter("username");
			String password = context.getInitParameter("password");
			Connection con = DriverManager.getConnection(url, username, password);
			
			String query = "delete from employee where eid=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, no);
			
			int result = ps.executeUpdate();
			if(result > 0)
				response.sendRedirect("view");
			
		}catch(Exception e){e.printStackTrace();}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
