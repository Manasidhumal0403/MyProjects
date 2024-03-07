package com.fetchdata;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/login")
public class loginvalidation extends GenericServlet {
	private PrintWriter pWriter;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Bappa@123");
			PreparedStatement ps =  con.prepareStatement("select from users email=? and password=?");
		
			ResultSet rs=ps.executeQuery();
			
			PrintWriter pw=res.getWriter();
			
		    if (rs.next())
		    {
		    	if(email.equals(rs.getString("email"))&& password.equals("password"))
		    	{
			    	RequestDispatcher rd = req.getRequestDispatcher("fromservlettohtml.html");
			    	rd.include(req, res);
			    	
		    	}
		    	else
		    	{
		    		RequestDispatcher rd = req.getRequestDispatcher("login.html");
		    		rd.include(req, res);
		    	}
		    	
		    }
		    else
		    {
		    	pw.println("<h1> invalid credentials <h1>");
				
		    }

			
			
			
		} 
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();	
			}
		
	
	catch (SQLException e)
	{
		e.printStackTrace ();
	}
	

}
	


		
	}

	

