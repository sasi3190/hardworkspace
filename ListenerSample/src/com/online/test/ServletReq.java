package com.online.test;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ServletReq implements ServletRequestAttributeListener {

  
    public ServletReq() {
        
    }

	
    public void attributeRemoved(ServletRequestAttributeEvent event) {
     System.out.println("Attribute req from Request object Removed........"+event.getName());
    }

	
    public void attributeAdded(ServletRequestAttributeEvent event) {
    	System.out.println("Attribute req from Request object Added..............."+event.getName());
    } 
    
    public void attributeReplaced(ServletRequestAttributeEvent event) {
    	System.out.println("Attribute req from Request object Replaced........"+event.getName());
    }
	
}
