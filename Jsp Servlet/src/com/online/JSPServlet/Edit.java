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

//@WebServlet("/edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int eid = Integer.parseInt(request.getParameter("eid"));
		String Name = request.getParameter("ename");
		double Pay = Double.parseDouble(request.getParameter("epay"));
		double Bonus = Double.parseDouble(request.getParameter("ebonus"));
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		try{
			/*String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "system";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);
			String driver ="com.mysql.jdbc.Driver";
			Class.forName(driver);
			String url ="jdbc:mysql://localhost/MYSQL";
			String username = "sasi";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);*/
			ServletContext context = getServletContext();
			String driver =context.getInitParameter("driver");
			Class.forName(driver);
			String url =context.getInitParameter("url");
			String username = context.getInitParameter("username");
			String password = context.getInitParameter("password");
			Connection con = DriverManager.getConnection(url, username, password);
			
			
			String query = "update employee set ename=?, epay=?,ebonus=?, uname=?, pwd=? where eid=?";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, Name);
			ps.setDouble(2, Pay);
			ps.setDouble(3, Bonus);
			ps.setString(4, uname);
			ps.setString(5, pwd);
			ps.setInt(6, eid);
			
			
			int ans = ps.executeUpdate();
			if(ans>0)
				response.sendRedirect("view");
			
		}catch(Exception e){e.printStackTrace();}
	}

}
