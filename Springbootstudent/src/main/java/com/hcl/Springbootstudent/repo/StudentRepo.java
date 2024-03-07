package com.hcl.Springbootstudent.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.Springbootstudent.dto.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

	Student findStudentByPhone(long phone);

	Student getStudentByEmail(String email);

	List<Student> getStudentByAddress(String address);

	List<Student> getStudentBySecureMark(double secureMark);

	List<Student> getStudentByName(String name);

	List<Student> findStudentBySecureMarkLessThan(double secureMark);

	List<Student> findStudentBySecureMarkGreaterThan(double secureMark);

//	List<Student> findStudentBySecureMarkInBetween(double secureMark1, double secureMark2);
	List<Student> findStudentsBySecureMarkBetween(double SecureMark1, double SecureMark2);


}
