package com.manasi.hospitalmanagement_springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.manasi.hospitalmanagement_springboot.dto.Branches;
import com.manasi.hospitalmanagement_springboot.service.BranchService;
import com.manasi.hospitalmanagement_springboot.util.ResponseStructure;

@RestController
@RequestMapping("/branch")
public class BranchController {
	@Autowired
	private BranchService branchService;

	@PostMapping
	public ResponseStructure<Branches> saveBranches(@RequestParam int hospital_id, @RequestParam int address_id,
			@RequestBody Branches branches) {
		return branchService.saveBranches(hospital_id, address_id, branches);

	}
	@DeleteMapping
	public ResponseStructure<Branches> deleteBranches(@RequestParam int id) {
		return branchService.deleteBranches(id);
	}
	@GetMapping
	public ResponseStructure<Branches> findBranchById(@RequestParam int id) {
		return branchService.findBranchById(id);
	}
	@GetMapping("/branch/{hid}")
	public ResponseStructure<List<Branches>> getBranchByHospitalId(@PathVariable int hid) {
		return branchService.getBranchByHospitalId(hid);
	}
	
	

}