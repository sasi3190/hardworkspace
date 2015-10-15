package com.online.test;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


@WebListener
public class OthertypeofAttri implements HttpSessionAttributeListener {

    
    
	
    public void attributeAdded(HttpSessionBindingEvent event) {
    	System.out.println("Attribute req from HTTP Added------@@@@"+event.getName()); 
    }

    public void attributeRemoved(HttpSessionBindingEvent event) {
    	System.out.println("Attribute req from HTTP removed------@@@@"+event.getName());
    }

	
    public void attributeReplaced(HttpSessionBindingEvent event) {
    	System.out.println("Attribute req from HTTP Replaced------@@@@"+event.getName());
    }
	
}
