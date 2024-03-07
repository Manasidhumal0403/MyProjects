package com.manasi.hospitalmanagement_springboot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.manasi.hospitalmanagement_springboot.dto.Hospital;
import com.manasi.hospitalmanagement_springboot.repo.HospitalRepo;
import com.manasi.hospitalmanagement_springboot.service.HospitalService;

@Repository
public class HospitalDao {
	@Autowired
	private HospitalRepo repo;
	public Hospital saveHospital( Hospital hospital) {
		return repo.save(hospital);
	}
	public Hospital findHospital(int id) {
		// TODO Auto-generated method stub
		Optional<Hospital> optional=repo.findById(id);
		if (optional.isEmpty()) {
			return null;
			
		}
		else
		{
			Hospital hospital=optional.get();
			return hospital;
			
		}
	}
	public Hospital updateHospital(Hospital hospital,int id) {
		Optional<Hospital> optional=repo.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		else {
			hospital.setId(id);
			return hospital;
		}
	}
	public Hospital deleteHospital(int id) {
		Optional<Hospital> optional=repo.findById(id);
		if (optional.isPresent()) {
		Hospital hospital=optional.get();
		repo.delete(hospital);
		return hospital;
	}
		else
		{
			return null;
		}
		

}
	public Hospital findByEmailHospita(String email) {
		return repo.findHospitalByEmail(email);
	}
	public List<Hospital> findAllHospital() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	
}
