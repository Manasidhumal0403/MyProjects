package com.savecookiespro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class CookiesSave extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String name =req.getParameter("name");//invalid key it gives output as null
	String mobile = req.getParameter("mobile");
	String password = req.getParameter("password");
	System.out.println(name);
	System.out.println(mobile);
	System.out.println(password);
	Cookie cookie1 = new Cookie("name",name);//setMaxage()
	Cookie cookie2 = new Cookie("phone",mobile);
	Cookie cookie3 =new Cookie ("password",password);
	resp.addCookie(cookie1);
	resp.addCookie(cookie2);
	resp.addCookie(cookie3);
	PrintWriter printWriter=resp.getWriter();
	printWriter.println("<h1> cookies saved succesfully<h1>");
	
	RequestDispatcher dispatcher=req.getRequestDispatcher("CookiesSave2");
	dispatcher.include(req, resp);
	
}
}















