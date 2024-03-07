package com.manasi.hospitalmanagement_springboot.exception;

public class HospitalIdNotFound extends RuntimeException{
 private String message="Hospital Id Not Found";
@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
public HospitalIdNotFound(String message) {
	super();
	this.message = message;
}


}
