package com.manasi.hospitalmanagement_springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manasi.hospitalmanagement_springboot.dto.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
