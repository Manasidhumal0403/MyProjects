package com.manasi.hospitalmanagement_springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.manasi.hospitalmanagement_springboot.dao.AddressDao;
import com.manasi.hospitalmanagement_springboot.dto.Address;
import com.manasi.hospitalmanagement_springboot.dto.Hospital;
import com.manasi.hospitalmanagement_springboot.exception.AddressNotFound;
import com.manasi.hospitalmanagement_springboot.exception.HospitalIdNotFound;
import com.manasi.hospitalmanagement_springboot.util.ResponseStructure;
@Service
public class AddressService {
	@Autowired
    private AddressDao addressDao;
	public Address saveAddress(Address address) {
		
		return addressDao.saveAddress(address);
	}
	public Address updateAddress(Address address, int id) {
		// TODO Auto-generated method stub
		return addressDao.updateAddress(address,id);
	}
	
		public ResponseEntity<ResponseStructure<Address>> findAddress(int id) {
			Address address=addressDao.findAddress(id);
			ResponseStructure<Address> responseStructure = new ResponseStructure<>();
			if (address!= null) {
				responseStructure.setMessage("Address found successfully");
				
				responseStructure.setStatusCode(HttpStatus.FOUND.value());
				responseStructure.setData(address);
				return new ResponseEntity<>(responseStructure,HttpStatus.FOUND);
			}
			else
			{
				throw new AddressNotFound("Hospital Id Not Found");
			}

		
	}
	public Address deleteAddress(int id) {
		return addressDao.deleteAddress(id);
	}
	
	
	

	
}
