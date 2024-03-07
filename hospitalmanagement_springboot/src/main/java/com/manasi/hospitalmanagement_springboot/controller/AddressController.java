package com.manasi.hospitalmanagement_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.manasi.hospitalmanagement_springboot.dto.Address;
import com.manasi.hospitalmanagement_springboot.service.AddressService;
import com.manasi.hospitalmanagement_springboot.util.ResponseStructure;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	private AddressService addressService;
	
	@PostMapping
	public Address saveAddress(@RequestBody Address address) {
		return addressService.saveAddress(address);
	}
	@PutMapping
	public Address updateAddress(@RequestBody Address address,@RequestParam int id) {
		return addressService.updateAddress(address,id);
	}
	@GetMapping
	public ResponseEntity<ResponseStructure<Address>> findAddress(@RequestParam int id) {
		return addressService.findAddress(id);
	}
	@DeleteMapping
	public Address  deleteAddress(@RequestParam int id) {
		return addressService.deleteAddress(id);
	}

	
	

}
