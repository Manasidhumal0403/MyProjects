package batchProcessingWIthPreparedStatement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BpwithPS {
public static void main(String[] args) throws SQLException {
		
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Bappa@123");
		PreparedStatement ps=con.prepareStatement("insert into student (id,name,age) values (?,?,?)");
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<3;i++)
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter age");
			int age=sc.nextInt();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			
			ps.addBatch();

	}
		ps.executeBatch();
		System.out.println("batch execute succesfully");

		}

}
