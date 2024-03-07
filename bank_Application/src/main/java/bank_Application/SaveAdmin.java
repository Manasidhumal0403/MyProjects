package bank_Application;

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
@WebServlet("/saveadmin")
public class SaveAdmin extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
			
			
			String id = req.getParameter("id");
			String email =req.getParameter("email");
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			String mobilenumber = req.getParameter("mobilenumber");
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapplication","root","Bappa@123");
				PreparedStatement ps =  con.prepareStatement("insert into admin(id,email,username,password,mobno) values (?,?,?,?,?)");
				ps.setString(1,id);
				ps.setString(2,email);
				ps.setString(3,username);
				ps.setString(4, password);
				ps.setString(5,mobilenumber);
				
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

	


