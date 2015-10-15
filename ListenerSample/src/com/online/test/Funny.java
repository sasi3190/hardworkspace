package com.online.test;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Funny")
public  class Funny extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			//-----REQUEST OBJECT-----------
			request.setAttribute("School","Ebenezer");
			Thread.sleep(4000);
			request.setAttribute("Class","highschool");	
			Thread.sleep(4000);
			request.setAttribute("Class", "Master");	
			Thread.sleep(4000);
			request.removeAttribute("Class");
			//----------HTTPSESSION------
			HttpSession session = request.getSession();
			session.setAttribute("name", "Sasi");
			Thread.sleep(4000);
			session.setAttribute("sal", 123456);	
			Thread.sleep(4000);
			session.setAttribute("sal", 784522);	
			Thread.sleep(4000);
			session.removeAttribute("sal");
			//--------------SERVLET CONTEXT------
			ServletContext context = getServletContext();
			context.setAttribute("SEX", "Male");
			Thread.sleep(4000);
			context.setAttribute("Relationship", "Married");	
			Thread.sleep(4000);
			context.setAttribute("Relationship", "unMarried");	
			Thread.sleep(4000);
			context.removeAttribute("Relationship");
		}
	catch(Exception e){
		e.printStackTrace();
	}
		
	}

}
