package com.manasi.hospitalmanagement_springboot.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manasi.hospitalmanagement_springboot.dto.Patient;
import com.manasi.hospitalmanagement_springboot.repo.PatientRepo;

@Repository
public class PatientDao {
	@Autowired
	private PatientRepo patientRepo;

	public Patient savePatient(Patient patient) {
		
		// TODO Auto-generated method stub
		return patientRepo.save(patient);
	}

	public Patient getPatientById(int id) {
		Optional<Patient> optional=patientRepo.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		else {
		Patient patient=optional.get();
		
		return patient;
		
		
	}

}
}
