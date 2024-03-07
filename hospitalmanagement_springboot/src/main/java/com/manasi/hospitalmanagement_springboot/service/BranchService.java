package com.manasi.hospitalmanagement_springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.manasi.hospitalmanagement_springboot.dao.AddressDao;
import com.manasi.hospitalmanagement_springboot.dao.BranchDao;
import com.manasi.hospitalmanagement_springboot.dao.HospitalDao;
import com.manasi.hospitalmanagement_springboot.dto.Address;
import com.manasi.hospitalmanagement_springboot.dto.Branches;
import com.manasi.hospitalmanagement_springboot.dto.Hospital;
import com.manasi.hospitalmanagement_springboot.util.ResponseStructure;
@Service
public class BranchService {
	@Autowired
	private BranchDao branchDao;
	@Autowired
	private HospitalDao dao;
	@Autowired
	private AddressDao addressDao;

	public ResponseStructure<Branches> saveBranches(int hospital_id, int address_id,Branches branches) {
		ResponseStructure<Branches> responseStructure=new ResponseStructure<>();
		Hospital hospital=dao.findHospital(hospital_id);
		Address address=addressDao.findAddress(address_id);
		
		if(hospital != null && addressDao != null) {
			branches.setHospital(hospital);
			branches.setAddress(address);
			responseStructure.setMessage("data Saved Successfully");
			responseStructure.setStatusCode(HttpStatus.OK.value());
			responseStructure.setData(branchDao.saveBranches(branches));
			return responseStructure;
		}
		responseStructure.setMessage("unsucessfull");
		responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
		return responseStructure;
		
	}
	public ResponseStructure<Branches> deleteBranches(int id) {
		Branches branches= branchDao.deleteBranches(id);
	ResponseStructure<Branches> responseStructure=new ResponseStructure<>();
	if (branches!=null) {
	responseStructure.setMessage("deleted");
	responseStructure.setStatusCode(HttpStatus.OK.value());
	responseStructure.setData(branches);
	    return responseStructure;
	}
	else
	{
		responseStructure.setMessage("Not deleted");
		responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
		responseStructure.setData(branches);
		return responseStructure;
	}
	}
	public ResponseStructure<Branches> findBranchById(int id) {
		
		Branches branches= branchDao.findBranchById(id);
		ResponseStructure<Branches> responseStructure=new ResponseStructure<>();
		
		if (branches != null) {
			responseStructure.setMessage("id found Successfully");
			responseStructure.setStatusCode(HttpStatus.OK.value());
			responseStructure.setData(branches);
			return responseStructure;
		}
		else {
			responseStructure.setMessage("Unsucessfully ID not found");
			responseStructure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
			responseStructure.setData(branches);
			return responseStructure;
		}
	}
	public ResponseStructure<List<Branches>> getBranchByHospitalId(int hid) {
		return  branchDao.getBranchByHospitalId(hid);
	}




	

//	public List<Branches> getBranchesByHospital(int h_id) {
//		Hospital hospital=dao.findHospital(h_id);
//		return branchDao.getBranchByHospital(hospital);
//	}

	
	

	
}
