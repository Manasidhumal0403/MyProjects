package com.fetchdata;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/savedata")
public class SaveStudent extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String mobilenumber = req.getParameter("mobilenumber");
		String yop = req.getParameter("yop");
		System.out.print(id);
		System.out.print(name);
		System.out.print(age);
		System.out.print(mobilenumber);
		System.out.print(yop);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/college2","root","Bappa@123");
			PreparedStatement ps =  con.prepareStatement("insert into Student(id,name,age,mobilenumber,yop) values (?,?,?,?,?)");
			ps.setInt(1,Integer.parseInt(id));
			ps.setString(2,name);
			ps.setInt(3,Integer.parseInt(age));
			ps.setLong(4,Long.parseLong(mobilenumber));
			ps.setInt(5, Integer.parseInt(yop));
			ps.execute();
			PrintWriter pWriter = res.getWriter();
			pWriter.println("<h1> data saved successfully <h1>");
			
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
