package com.hcl.Springbootstudent.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;


import com.hcl.Springbootstudent.dto.Student;
import com.hcl.Springbootstudent.repo.StudentRepo;
@Repository
public class StudentDao {
	@Autowired
  StudentRepo repo;
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}
	public Student getStudent(int id) {
		
	  Optional<Student> optional=repo.findById(id);
	  if (optional.isPresent()) {
		  return optional.get();
	  }
	  else {
		  return null;
	  }
	}
	@GetMapping("/findAll")
	public List<Student> getAllStudent(){
		return repo.findAll();
	}
	public Student deleteStudent(int id) {
		// TODO Auto-generated method stub
		Optional<Student> optional=repo.findById(id);
		if (optional.isEmpty())
		{
			return null;
		}
		Student student=optional.get();
		repo.delete(student);
		return student;
	}
	public Student updateStudent(int id,Student student ) {
	     Optional<Student> optional=repo.findById(id);
	     if (optional.isPresent())
	     {
	    	 student.setId(id);
	    	 return repo.save(student);
	     }
	     System.out.println("id not found");
		return null;
	}
	public Student updatePhone(int id, long phone) {
		Optional<Student> optional=repo.findById(id);
		if(optional.isEmpty())
		{
			return null;
		}
		Student student=optional.get();
		student.setId(id);
		return repo.save(student);
	}
	public Student updateEmail(int id, String email) {
		Optional<Student> optional=repo.findById(id);
		if(optional.isEmpty())
		{
			return null;
		}
		Student student=optional.get();
		student.setEmail(email);
		return repo.save(student);
	}
	public Student updateAddress(int id, String address) {
		Optional<Student> optional=repo.findById(id);
		if(optional.isEmpty())
		{
			return null;
		}
		Student student=optional.get();
		student.setAddress(address);
		return repo.save(student);
	}
	public Student updateSecureMarks(int id, double secureMark) {
		Optional<Student> optional=repo.findById(id);
		if(optional.isEmpty())
		{
			return null;
		}
		Student student=optional.get();
		student.setSecureMark(secureMark);
		return repo.save(student);
	}
	public List<Student> getByName(String name) {
		// TODO Auto-generated method stub
		return repo.getStudentByName(name) ;
	}
	public Student getByPhone(long phone) {
		// TODO Auto-generated method stub
		return repo.findStudentByPhone(phone);
	}
	public Student getByEmail(String email) {
		// TODO Auto-generated method stub
		return repo.getStudentByEmail(email) ;
	}
	public List<Student> getByAddress(String address) {
		// TODO Auto-generated method stub
		return repo.getStudentByAddress(address);
	}
	
	public List<Student> getBySecureMark(double secureMark) {
		// TODO Auto-generated method stub
		return repo.getStudentBySecureMark(secureMark) ;
	}
	public List<Student> getStudentBySecureMarkLessThan(double secureMark) {
		// TODO Auto-generated method stub
		return repo.findStudentBySecureMarkLessThan(secureMark);
	}
	public List<Student> getStudentBySecureMarkGreaterThan(double secureMark) {
		// TODO Auto-generated method stub
		return repo.findStudentBySecureMarkGreaterThan(secureMark);
	}
	public List<Student> getSecureMarkBetween(double secureMark1, double secureMark2) {
		// TODO Auto-generated method stub
		return repo.findStudentsBySecureMarkBetween(secureMark1, secureMark2);
	}
	public List<Student> getStudentBySecureMark(double secureMark) {
		// TODO Auto-generated method stub
		return repo.getStudentBySecureMark(secureMark);
	}
	
	
	
	

}
