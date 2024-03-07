package com.task;

public class Patient {

	private int id;
	private String firstname;
	private String lastname;
	private int age;
	private String contactNumber;
	private String geneder;
	private String bloodTestResults;
	private String urineTestResults;
	
	
	
	public Patient() {
		super();
	}
	public Patient(int id, String firstname, String lastname, int age, String contactNumber, String geneder,
			String bloodTestResults, String urineTestResults) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.contactNumber = contactNumber;
		this.geneder = geneder;
		this.bloodTestResults = bloodTestResults;
		this.urineTestResults = urineTestResults;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getGeneder() {
		return geneder;
	}
	public void setGeneder(String geneder) {
		this.geneder = geneder;
	}
	public String getBloodTestResults() {
		return bloodTestResults;
	}
	public void setBloodTestResults(String bloodTestResults) {
		this.bloodTestResults = bloodTestResults;
	}
	public String getUrineTestResults() {
		return urineTestResults;
	}
	public void setUrineTestResults(String urineTestResults) {
		this.urineTestResults = urineTestResults;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
				+ ", contactNumber=" + contactNumber + ", geneder=" + geneder + ", bloodTestResults=" + bloodTestResults
				+ ", urineTestResults=" + urineTestResults + "]";
	}	
  /*
   * firstName: string
middleName: string
lastName: string
age: number
contactNumber: string
gender: string
bloodTestResults: string
urineTestResults: string*/
	
	
}
