package com.savecookiespro;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookiesSave2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie [] cookies=req.getCookies();
		System.out.println(cookies);
		if (cookies!=null) {
			for (Cookie cookie : cookies)
			{
			
			System.out.println(cookie.getName()+" "+cookie.getValue());
			RequestDispatcher dispatcher=req.getRequestDispatcher("welcome.html");
			dispatcher.include(req, resp);
			}
		}
		else
			
			{
			RequestDispatcher dispatcher=req.getRequestDispatcher("loginform.html");
		     dispatcher.forward(req, resp);
			
				System.out.println("cookies not found");
			}
		
	}

}
