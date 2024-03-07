package com.hcl.Springbootstudent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.hcl.Springbootstudent.dao.StudentDao;
import com.hcl.Springbootstudent.dto.Student;
import com.hcl.Springbootstudent.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentDao dao;
	@Autowired
	private StudentService service;
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
		
	}
	@GetMapping("/find")
	public Student getStudent(@RequestParam int id) {
    return service.getStudent(id);
	}
	
	@GetMapping("/findAll")
	public List<Student> getAllEmploy(){
		return service.getAllStudent();
	}
	@DeleteMapping("/delete")
	public Student deleteStudent(@RequestParam int id) {
		 return service.deleteStudent(id);

	}
	@PutMapping("/update")
    public Student updateStudent(@RequestParam int id,@RequestBody Student student)
	{
		return service. updateStudent(id,student);
	}
	//I WANT UPDATE SINGLE DATA
	@PatchMapping("/updatephone")
	public Student updatePhone(@RequestParam int id,@RequestParam long phone)
	{
		return service.updatePhone(id,phone);
	}
	@PatchMapping("/updateEmail/{id}/{email}")
	public Student updateEmail(@PathVariable int id,@PathVariable String email)
	{
		return service.updateEmail(id,email);
	}
	@PatchMapping("updateaddress/{address}")//http://localhost:8081/updatesalary/5000?id=4
	public Student updateAddress(@RequestParam int id,@PathVariable String address) {
		return service.updateAddress(id,address);
	}
	@PatchMapping("updatesecuremark/{secureMark}")//http://localhost:8081/updatesalary/5000?id=4
	public Student updateSecureMark(@RequestParam int id,@PathVariable double secureMark) {
		return service.updateSecureMark(id, secureMark);
	}
	@GetMapping("/findByName")
	public List<Student> getByName(@RequestParam String name) {
		return service.getByName(name);
	}
	@GetMapping("/findByPhone")
	public Student getByPhone(@RequestParam long phone) {
		return service.getByPhone(phone);
	}
	@GetMapping("/findByEmail")
	public Student getByEmail(@RequestParam String email) {
		return service.getByEmail(email);
	}
	@GetMapping("/findByaddress")
	public List<Student> getByAddress(@RequestParam String address) {
		return service.getByAddress(address);
	}
	@GetMapping("/findBysecuremark")
	public List<Student> getByAddress(@RequestParam double secureMark) {
		return service.getBySecureMark(secureMark);
	}
	
	@GetMapping("/securemarkLessThan")
	public List<Student> getStudentBySecureMarkLessThan(@RequestParam double secureMark){
		return service.getStudentBySecureMarkLessThan(secureMark);
	}
	@GetMapping("/salaryGreaterThan/{salary}")
	public List<Student> getStudentBySecureMarkGreaterThan(@PathVariable double secureMark){
		return service.getStudentBySecureMarkGreaterThan(secureMark);
	}
	@GetMapping("/getSalaryBetween")
	public List<Student> getSecureMarkBetween(@RequestParam double secureMark1,@RequestParam double secureMark2){
		return service.getSecureMarkBetween(secureMark1, secureMark2);
	}


}



