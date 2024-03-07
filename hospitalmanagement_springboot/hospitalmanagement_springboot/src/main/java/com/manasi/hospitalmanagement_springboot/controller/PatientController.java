package com.manasi.hospitalmanagement_springboot.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.manasi.hospitalmanagement_springboot.dto.Patient;
import com.manasi.hospitalmanagement_springboot.service.PatientServices;

@RestController
@RequestMapping("/person")
public class PatientController {
	@Autowired
	private PatientServices patientServices;
	@PostMapping
	public Patient savePatient(@Valid @RequestBody Patient patient) {
		return patientServices.savePatient(patient);
	}
	public Patient getPatientById(@RequestParam int id) {
		return patientServices.getPatientById(id);
	}

}
