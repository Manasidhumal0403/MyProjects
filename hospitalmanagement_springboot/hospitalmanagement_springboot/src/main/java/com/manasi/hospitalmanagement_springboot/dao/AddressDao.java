package com.manasi.hospitalmanagement_springboot.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manasi.hospitalmanagement_springboot.dto.Address;
import com.manasi.hospitalmanagement_springboot.repo.AddressRepo;
@Repository
public class AddressDao {
	@Autowired
    private AddressRepo addressRepo;
	public Address saveAddress(Address address) {
		// TODO Auto-generated method stub
		return addressRepo.save(address);
	}
	public Address updateAddress(Address address, int id) {
		Optional<Address> optional=addressRepo.findById(id);
		if (optional.isPresent()) {
	    address.setId(id);
	    return address;
		}
		else
		{
			return null;
		}
	}
	public Address findAddress(int id) {
		  Optional<Address> optional= addressRepo.findById(id);
		  if (optional.isEmpty()) {
			  return null;
			  
		  }
		  else {
			 Address address= optional.get();
			 return address;
		  }
	}
	public Address deleteAddress(int id) {
		Optional<Address> optional=addressRepo.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		else
		{
		Address address=optional.get();
		addressRepo.delete(address);
		return address;
		}
		
	}
	

}
