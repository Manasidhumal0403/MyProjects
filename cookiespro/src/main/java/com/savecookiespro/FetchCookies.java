//28-09-2023
//28/08/2023 html file name FetchCookies
package com.savecookiespro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fetch")
public class FetchCookies extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		Cookie[] cookies=req.getCookies();
		if (cookies!=null)
		{
			for (Cookie cookie : cookies)
			{
//				PrintWriter	printWriter=resp.getWriter();
//				printWriter.println("<h1>cookies.getName()</h1>");
					
			System.out.println(cookie.getName()+" "+cookie.getValue());
			}
		}
		else
		{
			PrintWriter	printWriter=resp.getWriter();
			printWriter.println("<h1>no cookies are available on browser</h1>");
				
			}
		}
		

}

