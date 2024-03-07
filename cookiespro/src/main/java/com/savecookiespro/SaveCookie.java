// SaveCookies html file for saving the cookies in browser
package com.savecookiespro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/savecookies1")
public class SaveCookie extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		String id =req.getParameter("id");//invalid key it gives output as null
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		System.out.println(id);
		System.out.println(name);
		System.out.println(password);
		Cookie cookie1 = new Cookie("id",id);//setMaxage()
		Cookie cookie2 = new Cookie("name",name);
		Cookie cookie3 =new Cookie ("password",password);
		
		//add cookie()method is used to add the cookies along with the response and saves the cookies inside a browser
		
		resp.addCookie(cookie1);
		resp.addCookie(cookie2);
		resp.addCookie(cookie3);
		
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.println("<h1> cookies saved succesfully<h1>");
	}

}
