package batchprocessingwithstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StetementWithBatchProcessing {
	
public static void main(String[] args) throws SQLException {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Bappa@123");
	Statement st=con.createStatement();
//st.addBatch("create database school");
//	st.addBatch("create table student (id int,name varchar(20), age int)");
	st.addBatch("insert into student (id,name,age) values (1,'manasi',24)");
	st.addBatch("insert into student (id,name,age) values (2,'aishwarya',24)");
	st.addBatch("insert into student (id,name,age) values (3,'aditya',24)");
	st.addBatch("insert into student (id,name,age) values (4,'sam',24)");
	st.addBatch("insert into student (id,name,age) values (5,'pradnya',24)");
	st.addBatch("insert into student (id,name,age) values (6,'jyot',24)");
	st.addBatch("delete from student where id=6");
	st.addBatch("update student set name ='shambhu' where id=4");
	st.executeBatch();
	System.out.println("batch executed");
	
	


	}

}
