package com.online.test;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class StraightContext implements ServletContextAttributeListener {

   
   
	
    public void attributeAdded(ServletContextAttributeEvent event) {
    	System.out.println("Attribute req from ServletContext Added........"+event.getName());
       
    }
	
    public void attributeRemoved(ServletContextAttributeEvent event) {
    	System.out.println("Attribute req from ServletContext Removed........"+event.getName());  
    }

	
    public void attributeReplaced(ServletContextAttributeEvent event) {
    	System.out.println("Attribute req from ServletContext replaced........"+event.getName());
    }
	
}
