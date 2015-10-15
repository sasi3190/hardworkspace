package com.online.JSPServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.lang.NumberFormatException;

@WebServlet("/create")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	
	public void init(ServletConfig config){
		try{
			//String driver = "oracle.jdbc.driver.OracleDriver";
			String driver ="com.mysql.jdbc.Driver";
			Class.forName(driver);
			String url ="jdbc:mysql://localhost/MYSQL";
			String username = "sasi";
			String password = "root";
			con = DriverManager.getConnection(url, username, password);
		//	String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			
		//	String url = "jdbc:mysql:@localhost:1521:xe";
		
		
			
		//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/MYSQL","sasi","root");
			System.out.println(" initialization");
		}catch(Exception e){e.printStackTrace();}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet is called...");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eid = Integer.parseInt(request.getParameter("eid"));
		String name = request.getParameter("ename");
		double pay = Double.parseDouble(request.getParameter("epay"));
		double bonus = Double.parseDouble(request.getParameter("ebonus"));
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		try{
			String query = "insert into employee values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, eid);
			ps.setString(2, name);
			ps.setDouble(3, pay);
			ps.setDouble(4, bonus);
			ps.setString(5, uname);
			ps.setString(6, pwd);
			
			int ans = ps.executeUpdate();
			
			PrintWriter out = response.getWriter();
			if(ans>0){
				response.sendRedirect("index.jsp?message=Employee Created successfully");
			}else{
				out.print("Employee not created successfully...");
			}
			
		}catch(Exception e){e.printStackTrace();}

	}
	
	public void destroy(){
		try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
