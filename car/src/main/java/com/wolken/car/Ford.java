package com.wolken.car;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ford extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<html> <head><title>car</title></head> <body>abcd</body></html>");
		writer.close();
		
	}

}
