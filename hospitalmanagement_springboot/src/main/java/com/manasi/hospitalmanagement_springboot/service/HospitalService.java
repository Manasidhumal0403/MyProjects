package com.manasi.hospitalmanagement_springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.manasi.hospitalmanagement_springboot.dao.BranchDao;
import com.manasi.hospitalmanagement_springboot.dao.HospitalDao;
import com.manasi.hospitalmanagement_springboot.dto.Branches;
import com.manasi.hospitalmanagement_springboot.dto.Hospital;
import com.manasi.hospitalmanagement_springboot.exception.HospitalIdNotFound;
import com.manasi.hospitalmanagement_springboot.repo.HospitalRepo;
import com.manasi.hospitalmanagement_springboot.util.ResponseStructure;



@Service
public class HospitalService {
	@Autowired
	private HospitalDao dao;

	public ResponseEntity<ResponseStructure<Hospital>> saveHospital(Hospital hospital) {
		ResponseStructure<Hospital> responseStructure = new ResponseStructure<>();
		responseStructure.setMessage("Hospital Saved Successfully");
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setData(dao.saveHospital(hospital));
		return new ResponseEntity<>(responseStructure,HttpStatus.CREATED);
	}

	public ResponseEntity<ResponseStructure<Hospital>> findHospital(int id) {
		Hospital hospital=dao.findHospital(id);
		ResponseStructure<Hospital> responseStructure = new ResponseStructure<>();
		if (hospital!= null) {
			responseStructure.setMessage("Hospiat found successfully");
			
			responseStructure.setStatusCode(HttpStatus.FOUND.value());
			responseStructure.setData(hospital);
			return new ResponseEntity<>(responseStructure,HttpStatus.FOUND);
		}
		else
		{
			throw new HospitalIdNotFound("Hospital Id Not Found");
		}

		
	}

	public ResponseStructure<Hospital> updateHospital(Hospital hospital, int id) {
		Hospital hospital2=dao.updateHospital(hospital, id);
		ResponseStructure<Hospital> responseStructure=new ResponseStructure<>();
		if (hospital2!=null) {
		responseStructure.setMessage("update successfully");
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setData(hospital2);
		return responseStructure;
		}
		else
		{
			responseStructure.setMessage("update successfully");
			responseStructure.setStatusCode(HttpStatus.NOT_MODIFIED.value());
			responseStructure.setData(hospital2);
			return responseStructure;
		}	
		}
		
		
		
	

	public ResponseStructure<Hospital> deleteHospital(int id) {
		
		Hospital hospital=dao.deleteHospital(id);
		if (hospital!=null) {
			ResponseStructure<Hospital> responseStructure=new ResponseStructure<>();
			 responseStructure.setMessage(" Successfully  deleted");
		     responseStructure.setStatusCode(HttpStatus.OK.value());
		     responseStructure.setData(hospital);
		     return responseStructure;
	}
		
			ResponseStructure<Hospital> responseStructure=new ResponseStructure<>();
			 responseStructure.setMessage("Id not found");
		   responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
		     return responseStructure;
		     
		}
	

	public ResponseStructure<Hospital> findByEmailHospital(String email) {
	
		Hospital hospital= dao.findByEmailHospita(email);
		if (hospital!=null) {
			ResponseStructure<Hospital> responseStructure=new ResponseStructure<>();
			responseStructure.setMessage("Find Email successfully");
			responseStructure.setStatusCode(HttpStatus.OK.value());
			responseStructure.setData(hospital);
			return responseStructure;
		}
		else {
			ResponseStructure<Hospital> responseStructure=new ResponseStructure<>();
			responseStructure.setMessage("Not found Email");
			responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			responseStructure.setData(hospital);
			return responseStructure;
			
		}
	}

	public ResponseStructure<List<Hospital>> findAllHospital() {
		
		List<Hospital> hospitals=dao.findAllHospital();
		 ResponseStructure<List<Hospital>>  responseStructure=new ResponseStructure<>();
		if (hospitals.isEmpty()) {
			
			responseStructure.setMessage("No data Avilabale");
			responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			responseStructure.setData(hospitals);
			return responseStructure;
		}
		else
		{
			
				responseStructure.setMessage("data Found SUCESSFULLY");
				responseStructure.setStatusCode(HttpStatus.FOUND.value());
				responseStructure.setData(hospitals);
				return responseStructure;
		}
	}

	

	

	

}
