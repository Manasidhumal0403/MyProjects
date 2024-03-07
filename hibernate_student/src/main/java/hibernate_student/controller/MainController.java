package hibernate_student.controller;

import java.util.Scanner;

import hibernate_student.dao.StudentDao;
import hibernate_student.dto.Student;

public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		StudentDao dao=new StudentDao();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the choice \n1.Save Student \n2.find Student2 \n3.Find all data \n4.find By phone \n5.Update a Student \n6. delete a student \n7. update phone number \n8. update name \n12.deleteStudentBY address");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
		{
			System.out.println("Ente the id");
			int id=scanner.nextInt();
			System.out.println("Ente the name");
			String name=scanner.next();
			System.out.println("Ente the age");
			int age=scanner.nextInt();
			System.out.println("Ente the marks");
			int marks=scanner.nextInt();
			System.out.println("Ente the parcentage");
			double percentage=scanner.nextDouble();
			System.out.println("Ente the phone");
			long phone=scanner.nextLong();
			
			student.setId(id);
			student.setName(name);
			student.setAge(age);
			student.setMarks(marks);
			student.setPercentage(percentage);
			student.setPhone(phone);
			dao.saveStudent(student);
		}
			
			break;
		case 2:{
			System.out.println("Ente the id");
			int id=scanner.nextInt();
		
			dao.findStudent(id);
			
		}
		break;
		case 3:{
			
		
			dao.findAllStudent();
			
		}
		break;
		case 4:
		{
      System.out.println("enter a phone");
      long phone=scanner.nextLong();
		dao.findByPhone(phone);
		
		}
		break;
		case 5:
		{
			System.out.println("Ente the id");
			int id=scanner.nextInt();
			System.out.println("Ente the name");
			String name=scanner.next();
			System.out.println("Ente the age");
			int age=scanner.nextInt();
			System.out.println("Ente the marks");
			int marks=scanner.nextInt();
			System.out.println("Ente the parcentage");
			double percentage=scanner.nextDouble();
			System.out.println("Ente the phone");
			long phone=scanner.nextLong();
			
			student.setId(id);
			student.setName(name);
			student.setAge(age);
			student.setMarks(marks);
			student.setPercentage(percentage);
			student.setPhone(phone);
			dao.updateStudent(id,student);
		}
		break;
		case 6:
		{
			System.out.println("Ente the id");
			int id=scanner.nextInt();
		
			dao.deleteStudent(id);
		}
		
		default:
			break;
		case 7:
		{
			System.out.println("Ente the id");
			int id=scanner.nextInt();
			
			double percentage=scanner.nextDouble();
			System.out.println("Ente the phone");
			long phone=scanner.nextLong();
			
			student.setId(id);
			student.setPhone(phone);
			
			dao.updatePhone(id,phone);
		}
		break;
//		case 8:
//		{
//			System.out.println("Enter a id");
//			int id= scanner.nextInt();
//			System.out.println("Enter a name");
//			String name=scanner.next();
//			
//			
//			
//			student.setId(id);
//			student.setName(name);
//			dao.updateName(id);
//			
//		}
		case 9:
		{
			System.out.println("Enter a id");
			int id= scanner.nextInt();
			System.out.println("Enter phone");
			long phone=scanner.nextLong();
			
			
			dao.deleteByPhone(id,phone);
			
		}
		case 10:
		{
			
			System.out.println("Enter address");
			String address=scanner.next();
			
			
			dao.deleteByAddress(address,student);
		}
		

	}
	}

	}

