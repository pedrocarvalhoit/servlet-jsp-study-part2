package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class idFilter
 */
@WebFilter("/addPedro")
public class idFilter extends HttpFilter implements Filter {
       
   
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		
		HttpServletRequest req = (HttpServletRequest) request;
		int aid = Integer.parseInt(request.getParameter("aid"));
		
		if (aid > 0) {
			chain.doFilter(request, response);
		}else
				out.println("Invalid input");
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
