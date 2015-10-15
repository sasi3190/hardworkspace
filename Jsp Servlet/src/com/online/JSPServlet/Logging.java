package com.online.JSPServlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class Logging implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("before = "+System.currentTimeMillis());

		// pass the request along the filter chain
		chain.doFilter(request, response);		// calling servlet 

		System.out.println("after = "+System.currentTimeMillis());
	}

	public void destroy() {
		
	}

}
