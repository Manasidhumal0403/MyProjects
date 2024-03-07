package com.savecookiespro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/savecookies")
public class Cookies extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//	super.doPost(req, resp);
		Cookie cookie1 = new Cookie("name","sam");
		Cookie cookie2 = new Cookie("age","23");
		Cookie cookie3 =new Cookie ("address","bengluru");
		
		//add cookie()method is used to add the cookies along with the response and saves the cookies inside a browser
		
		resp.addCookie(cookie1);
		resp.addCookie(cookie2);
		resp.addCookie(cookie3);
		
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.println("<h1> cookies saved succesfully<h1>");
		
	}

}
