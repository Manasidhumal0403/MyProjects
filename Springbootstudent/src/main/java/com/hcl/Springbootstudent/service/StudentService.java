package com.hcl.Springbootstudent.service;

import java.util.List;

import org.aspectj.apache.bcel.generic.RET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.Springbootstudent.dao.StudentDao;
import com.hcl.Springbootstudent.dto.Student;
@Service
public class StudentService {
	@Autowired
	StudentDao dao;
public Student saveStudent(Student student) {
	double secureMark=student.getSecureMark();
	double totalMark=student.getTotalMark();
	double totalMark1=(secureMark*100)/totalMark;
	
	if (totalMark1<35) {
		student.setResult("fail");
	}
	else if(totalMark1>=35) {
		student.setResult("pass");
	}
	else if(totalMark1>=36 && totalMark1<=70) {
		student.setResult("second class");
	}
	else if (totalMark1>=70 && totalMark1<=85) {
		student.setResult("First Class");
	}
	else  {
		student.setResult("Distinct");
	}
	return dao.saveStudent(student);
	}
@GetMapping("/find")
public Student getStudent(@RequestParam int id) {
return dao.getStudent(id);
}

@GetMapping("/findAll")
public List<Student> getAllEmploy(){
	return dao.getAllStudent();
}
@DeleteMapping("/delete")
public Student deleteStudent(@RequestParam int id) {
	 return dao.deleteStudent(id);

}
@PutMapping("/update")
public Student updateStudent(@RequestParam int id,@RequestBody Student student)
{
	return dao. updateStudent(id,student);
}
//I WANT UPDATE SINGLE DATA
@PatchMapping("/updatephone")
public Student updatePhone(@RequestParam int id,@RequestParam long phone)
{
	return dao.updatePhone(id,phone);
}
@PatchMapping("/updateEmail/{id}/{email}")
public Student updateEmail(@PathVariable int id,@PathVariable String email)
{
	return dao.updateEmail(id,email);
}
@PatchMapping("updateaddress/{address}")//http://localhost:8081/updatesalary/5000?id=4
public Student updateAddress(@RequestParam int id,@PathVariable String address) {
	return dao.updateAddress(id,address);
}
@PatchMapping("updatesecuremark/{secureMark}")//http://localhost:8081/updatesalary/5000?id=4
public Student updateSecureMark(@RequestParam int id,@PathVariable double secureMark) {
	return dao.updateSecureMarks(id, secureMark);
}
@GetMapping("/findByName")
public List<Student> getByName(@RequestParam String name) {
	return dao.getByName(name);
}
@GetMapping("/findByPhone")
public Student getByPhone(@RequestParam long phone) {
	return dao.getByPhone(phone);
}
@GetMapping("/findByEmail")
public Student getByEmail(@RequestParam String email) {
	return dao.getByEmail(email);
}
@GetMapping("/findByaddress")
public List<Student> getByAddress(@RequestParam String address) {
	return dao.getByAddress(address);
}
@GetMapping("/findBysecuremark")
public List<Student> getByAddress(@RequestParam double secureMark) {
	return dao.getBySecureMark(secureMark);
}

@GetMapping("/securemarkLessThan")
public List<Student> getStudentBySecureMarkLessThan(@RequestParam double secureMark){
	return dao.getStudentBySecureMarkLessThan(secureMark);
}
@GetMapping("/salaryGreaterThan/{salary}")
public List<Student> getStudentBySecureMarkGreaterThan(@PathVariable double secureMark){
	return dao.getStudentBySecureMarkGreaterThan(secureMark);
}
@GetMapping("/getSalaryBetween")
public List<Student> getSecureMarkBetween(@RequestParam double secureMark1,@RequestParam double secureMark2){
	return dao.getSecureMarkBetween(secureMark1, secureMark2);
}
public List<Student> getAllStudent() {
	// TODO Auto-generated method stub
	return dao.getAllStudent();
}
public List<Student> getBySecureMark(double secureMark) {
	// TODO Auto-generated method stub
	return dao.getStudentBySecureMark(secureMark);
}


}






