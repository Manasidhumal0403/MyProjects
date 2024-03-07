package bank_Application;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.crypto.spec.PSource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class AdminValidate extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email=req.getParameter("email");
		String password = req.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapplication","root","Bappa@123");
			PreparedStatement  ps =connection.prepareStatement("select * from admin where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet resultset = ps.executeQuery();
			PrintWriter printWriter=resp.getWriter();
			while (resultset.next()) {
			
			
				if (resultset.getString("email").equals(email) && resultset.getString("password").equals(password))
				{
					printWriter.println("your are succesfully login");
					RequestDispatcher dispatcher=req.getRequestDispatcher("adminmenu.html");
					dispatcher.forward(req, resp);
					
				}
				else
				{
					printWriter.println("invalid credential");
					RequestDispatcher dispatcher1 = req.getRequestDispatcher("RegistrationForm.html");
					dispatcher1.include(req, resp);
					
				}
		
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	

}
