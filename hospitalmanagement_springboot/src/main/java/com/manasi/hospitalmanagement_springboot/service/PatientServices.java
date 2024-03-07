package com.manasi.hospitalmanagement_springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.manasi.hospitalmanagement_springboot.dao.PatientDao;
import com.manasi.hospitalmanagement_springboot.dto.Patient;

@Service
public class PatientServices {
	@Autowired
	private PatientDao dao;

	public Patient savePatient(Patient patient) {
		// TODO Auto-generated method stub
		return dao.savePatient(patient);
	}

	public Patient getPatientById(int id) {
		
		return dao.getPatientById(id);
	}

}
