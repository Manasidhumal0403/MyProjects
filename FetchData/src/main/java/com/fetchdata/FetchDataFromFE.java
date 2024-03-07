package com.fetchdata;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/fetchdata")
public class FetchDataFromFE extends GenericServlet{
@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String name=req.getParameter("name");//fetch the data from front end
	String email=req.getParameter("email");
	String id = req.getParameter("id");
	System.out.println(name);
	System.out.println(email);
	System.out.println(id);
	
	
}

}
