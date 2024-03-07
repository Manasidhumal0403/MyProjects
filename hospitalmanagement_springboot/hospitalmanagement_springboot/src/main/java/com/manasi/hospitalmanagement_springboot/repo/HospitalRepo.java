package com.manasi.hospitalmanagement_springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.manasi.hospitalmanagement_springboot.dto.Hospital;

public interface HospitalRepo extends JpaRepository<Hospital, Integer> {

	Hospital findHospitalByEmail(String email);
     

	

}
