package com.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class TestMain {
	
	
	public static Connection getConnnection() throws ClassNotFoundException, SQLException {
		
		Connection con=null;
		PreparedStatement pst=null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/task";
		String username="root";
		String password="Bappa@123";
		
		
		con=DriverManager.getConnection(url, username, password);
		String query="insert into task.patient values(?,?,?,?,?,?,?,?)";
		pst=con.prepareStatement(query);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id=sc.nextInt();
		pst.setInt(1, id);
		
		System.out.println("Enter firstname : ");
		String fname=sc.next();
		pst.setString(2, fname);
		
		System.out.println("Enter Lastname : ");
		String lname=sc.next();
		pst.setString(3, lname);
		
		System.out.println("Enter Age : ");
		int age=sc.nextInt();
		pst.setInt(4, age);
		
		System.out.println("Enter Conact number : ");
		String contactnumber=sc.next();
		pst.setString(5, contactnumber);
		
		System.out.println("Enter gender : ");
		String gender=sc.next();
		pst.setString(6, gender);
		
		System.out.println("Enter bloodTestResult : ");
		String bloodTestResult=sc.next();
		pst.setString(7, bloodTestResult);
		
		System.out.println("Enter uniretestresult : ");
		String urinetestresult=sc.next();
		pst.setString(8, urinetestresult);
		
		
		
		int i = pst.executeUpdate();
		System.out.println(i+" Record added .......");
		
		
		pst.close();
		
		return con;
		
		
	}
	public static void getdata() throws ClassNotFoundException, SQLException {
		
		Connection con = TestMain.getConnnection();
		
		String query="Select * from task.patient";
		PreparedStatement pst = con.prepareStatement(query);

		//pst.execute();
		ResultSet rs = pst.executeQuery();
        while(rs.next()){
           //Display values
           System.out.println("ID: " + rs.getInt(1));
           System.out.println("First name: " + rs.getString(2));
           System.out.println("last name: " + rs.getString(3));
           System.out.println(" Age " + rs.getInt(4));
           System.out.println(" contact number " + rs.getString(5));
           System.out.println(" Gender  " + rs.getString(6));
           System.out.println("bloodTestResult " + rs.getString(7));
           System.out.println("urinetestresult " + rs.getString(8));
        }
        rs.close();
        pst.close();
	

	}
	
	public static void removedata() throws ClassNotFoundException, SQLException {
		Connection con = TestMain.getConnnection();
		
		 String query="Delete from task.patient where id=?";
		 
		 PreparedStatement pst=con.prepareStatement(query);
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter id if u want to delete : ");
		 int id=sc.nextInt();
		 pst.setInt(1, id);
		 int i=pst.executeUpdate();
		 System.out.println(i+"deleted...");
	     pst.close();
	     con.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
      TestMain t = new TestMain(); 
      t.getdata();
      t.removedata();
		

	}

}
