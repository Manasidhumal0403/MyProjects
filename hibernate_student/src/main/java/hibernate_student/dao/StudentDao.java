package hibernate_student.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import java.util.List;

import javax.persistence.*;

import hibernate_student.dto.Student;

public class StudentDao {
	
	public EntityManager getEntityManager()
	{
//		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manasi");
//		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		return entityManager;
		return Persistence.createEntityManagerFactory("manasi").createEntityManager();
	}
	public void saveStudent(Student student)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		}
	public void findStudent(int id)
	{
		EntityManager entityManager=getEntityManager();
		Student student =entityManager.find(Student.class, id);
		if (student!=null) {
		System.out.println(student);
		
	}
		else
		{
			System.out.println("id not found "+id);
		}

	}
	public void findAllStudent()
	{
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("SELECT xyz FROM Student xyx ");
		List<Student>list=query.getResultList();
		System.out.println(list);
		
	}
	public void findByPhone(long phone)
	{
	EntityManager entityManager=getEntityManager();
	Query query=entityManager.createQuery("SELECT s FROM Student s WHERE s.id=1?");
	query.setParameter(1, phone);
	try {
		Student student=(Student) query.getSingleResult();//downcasting
		System.out.println(student);
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("student with given phone number not found....");
	}
	
}
//	public void updateStudent(int id,Student student)
//	{
//		//merge method it work like as a insert so thats why we are inserted id here then it work like update
//		
//		EntityManager entityManager=getEntityManager();
//		Student dbstudent=entityManager.find(Student.class,id);
//		if (dbstudent!=null) {
//			EntityTransaction entityTransaction=entityManager.getTransaction();
//			student.setId(id);
//			entityTransaction.begin();
//			entityManager.merge(student);
//			entityTransaction.commit();
//		}
//		else
//		{
//			System.out.println("id not found");
//		}
//	}
	public  void deleteStudent(int id)
	{
		EntityManager entityManager=getEntityManager();
	   Student student=entityManager.find(Student.class, id);
	   if (student!=null) {
		 EntityTransaction entityTransaction=entityManager.getTransaction();
		 entityTransaction.begin();
		 entityManager.remove(student);
		 entityTransaction.commit();
		
	}
	   else
	   {
		   System.out.println("id not found");
	   }
	}
	//update phone number
	public void updatePhone(int id,long phone)
	{
		EntityManager entityManager=getEntityManager();
		Student student=entityManager.find(Student.class,id);
		if (student!=null) {
			//new phone number set here
			
			EntityTransaction entityTransaction=entityManager.getTransaction();
		student.setPhone(phone);
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
			
		} 
		else 
		{
System.out.println("id not found");
		}
		}
	public void updateName(int id, String name) {
		// TODO Auto-generated method stub
		EntityManager entityManager=getEntityManager();
		Student student=entityManager.find(Student.class, id);
		if (student!=null)
		{
			EntityTransaction entityTransaction=entityManager.getTransaction();
			student.setName(name);
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			
		}
		else
		{
			System.out.println("id not found");
		}
		
		
		
		
	}
	public void updateStudent(int id,Student student) {
		// TODO Auto-generated method stub
		EntityManager entityManager=getEntityManager();
		Student dbstudent=entityManager.find(Student.class, id);
		if (dbstudent!=null)
		{
			student.setId(id);
			EntityTransaction entityTransaction=entityManager.getTransaction();
			
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			
		}
		else
		{
			System.out.println("id not found");
		}
		
		
		
		
	}
//	public void deleteByPhone(int id, long phone) {
//		
//		
//		EntityManager entityManager=getEntityManager();
//		Student student=entityManager.find(Student.class, id);
//		if (student!=null)
//		{
//			EntityTransaction entityTransaction=entityManager.getTransaction();
//					entityTransaction.begin();
//					entityManager.remove(student);
//					entityTransaction.commit();
//		}
//		// TODO Auto-generated method stub
//		
//	}
	
//	public void deleteByphone(long phone)
//	{
//		EntityManager entityManager=getEntityManager();
//		Query query=entityManager.createQuery("select s from Student s where s.phone=?1");
//		query.setParameter(1, phone);
//		if ()
//	}
	public void deleteByAddress(String address, Student student) {
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("SELECT s FROM Student s WHERE s.address=1?");
		query.setParameter(1, address);
		try {
		List<Student> list=query.getResultList();
		 for (Student s:list)
		 {
			 
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(list);
		entityTransaction.commit();
	
			
		}
		}
		 catch (Exception e) {
			// TODO: handle exception
			System.out.println("student with given phone number not found....");
		}
		
	}

}
