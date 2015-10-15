package com.online.JSPServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/view")
public class View extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
		/*	String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "system";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);
			----------Separate config---------------
			ServletConfig config = getServletConfig();
			String driver=config.getInitParameter("driver");
			Class.forName(driver);
			String url =config.getInitParameter("url");
			String username = config.getInitParameter("username");
			String password = config.getInitParameter("password");
			Connection con = DriverManager.getConnection(url, username, password);*/
			//-----MYSQL connection
			/*String driver ="com.mysql.jdbc.Driver";
			Class.forName(driver);
			String url ="jdbc:mysql://localhost/MYSQL";
			String username = "sasi";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);*/
			ServletContext context = getServletContext();
			String driver = context.getInitParameter("driver");
			Class.forName(driver);
			String url =context.getInitParameter("url");
			String username = context.getInitParameter("username");
			String password = context.getInitParameter("password");
			Connection con = DriverManager.getConnection(url, username, password);
			
			String query = "select * from employee";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
		
			/*PrintWriter out = response.getWriter();
			out.print("<table border='1' align='center'>");
			
			while(rs.next()){
				out.print("<tr>");
					out.print("<td>"+rs.getInt(1)+"<td>");
					out.print("<td>"+rs.getString(2)+"<td>");
					out.print("<td>"+rs.getDouble(3)+"<td>");
					out.print("<td>"+rs.getString(4)+"<td>");
				out.print("</tr>");
			}
			out.print("</table>");*/
			
			request.setAttribute("resultSet", rs);
			RequestDispatcher rd = request.getRequestDispatcher("viewEmployees.jsp");
			rd.forward(request, response);
			
			
		}catch(Exception e){	e.printStackTrace();		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
