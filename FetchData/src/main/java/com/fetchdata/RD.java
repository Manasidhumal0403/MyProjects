package com.fetchdata;


import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/requestfromhtml")
public class RD extends GenericServlet {
@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	// TODO Auto-generated method stub
	RequestDispatcher rd = req.getRequestDispatcher("fromservlettohtml.html");
	 
	rd.forward(req,res);
	
}
}
