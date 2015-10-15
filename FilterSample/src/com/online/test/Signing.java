package com.online.test;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/SignIn")
public class Signing implements Filter {

    
    public Signing() {
       
    }

	
	
	
		
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Filter usage ....");
		chain.doFilter(request, response);
		System.out.println("After response from servet described in the above program");
	}
	

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}
	public void destroy() {
	}

}
