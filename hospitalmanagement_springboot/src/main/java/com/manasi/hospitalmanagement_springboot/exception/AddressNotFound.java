package com.manasi.hospitalmanagement_springboot.exception;

public class AddressNotFound extends RuntimeException{
	String message="Address NOt found";
@Override
public String getMessage() {
	// TODO Auto-generated method stub
	return message;
}
public AddressNotFound(String message) {
	super();
	this.message = message;
}

}
