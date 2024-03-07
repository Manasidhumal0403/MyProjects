package com.fetchdata;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/printdata")
public class PrintDataOnBrowser extends GenericServlet  {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//we fetch the from enterd by the user
		String name=req.getParameter("name");
		
	PrintWriter pw =res.getWriter();
	//pw.println("hello "+name);
	pw.println("<table ><tr><td> apple</td><tr><td>mango</td></tr></tr></table>");
		
	}

}
