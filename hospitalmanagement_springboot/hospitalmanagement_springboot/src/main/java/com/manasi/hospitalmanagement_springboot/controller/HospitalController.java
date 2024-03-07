package com.manasi.hospitalmanagement_springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.manasi.hospitalmanagement_springboot.dto.Branches;
import com.manasi.hospitalmanagement_springboot.dto.Hospital;
import com.manasi.hospitalmanagement_springboot.service.HospitalService;
import com.manasi.hospitalmanagement_springboot.util.ResponseStructure;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	//@PostMapping("/savehospital")
	//@RequestMapping("/hospital")
	@PostMapping
	public ResponseEntity<ResponseStructure<Hospital>> saveHospital(@RequestBody Hospital hospital) {
		return hospitalService.saveHospital(hospital);
	}
	@GetMapping
	public ResponseEntity<ResponseStructure<Hospital>> findHospital(@RequestParam int id) {
		return hospitalService.findHospital(id);
	}
	@GetMapping("findAll")
	public ResponseStructure<List<Hospital>> findAllHospital(){
		return hospitalService.findAllHospital();
	}
	@PutMapping
	public ResponseStructure<Hospital> updateHospital(@RequestBody Hospital hospital,@RequestParam int id) {
		return hospitalService.updateHospital(hospital,id);
	}
	@DeleteMapping
	public ResponseStructure<Hospital> deleteHospital(@RequestParam int id) {
		return hospitalService.deleteHospital(id);
	}
	@GetMapping("/findbyemail")
	public ResponseStructure<Hospital> findByEmailHospital(@RequestParam String email) {
		return hospitalService.findByEmailHospital(email);
	}
	
}
