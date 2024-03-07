package com.manasi.hospitalmanagement_springboot.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.manasi.hospitalmanagement_springboot.util.ResponseStructure;
//@RestControllerAdvice
//public class ApplicationExceptionHandlers extends ResponseEntityExceptionHandler{
//	@ExceptionHandler(HospitalIdNotFound.class)
//	public ResponseEntity<ResponseStructure<String>> hospitalIdNotFound(HospitalIdNotFound found){
//		ResponseStructure<String> responseStructure=new ResponseStructure<>();
//		responseStructure.setMessage("Id noT Found Exception");
//		responseStructure.setStatusCode(HttpStatus.BAD_REQUEST.value());
//		responseStructure.setData(found.getMessage());
//		return new ResponseEntity<ResponseStructure<String>>(responseStructure,HttpStatus.BAD_REQUEST);
//		
//		
//	}
//	@ExceptionHandler(AddressNotFound.class)
//	public ResponseEntity<ResponseStructure<String>> addressNotFound(AddressNotFound found){
//		ResponseStructure<String> responseStructure=new ResponseStructure<>();
//		responseStructure.setMessage("Address NOT Found Exception");
//		responseStructure.setStatusCode(HttpStatus.BAD_REQUEST.value());
//		responseStructure.setData(found.getMessage());
//		return new ResponseEntity<ResponseStructure<String>>(responseStructure,HttpStatus.BAD_REQUEST);
//		
//		
//	}
//	@Override
//	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
//			HttpHeaders headers, HttpStatus status, WebRequest request) {
//		List<ObjectError> errors=ex.getAllErrors();
//		Map<String, String> map=new HashMap<>();
//		for (ObjectError objectError : errors) {
//			FieldError error=(FieldError)objectError;
//			String name=error.getField();
//			String message=error.getDefaultMessage();
//			map.put(name, message);
//			
//		}
//		return new ResponseEntity<Object>(map,HttpStatus.BAD_REQUEST);
//	}
//
//}
//
//
