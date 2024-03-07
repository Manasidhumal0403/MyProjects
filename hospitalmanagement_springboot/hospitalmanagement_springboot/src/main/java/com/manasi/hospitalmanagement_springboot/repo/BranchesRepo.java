package com.manasi.hospitalmanagement_springboot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manasi.hospitalmanagement_springboot.dto.Branches;
import com.manasi.hospitalmanagement_springboot.dto.Hospital;
import com.manasi.hospitalmanagement_springboot.util.ResponseStructure;

public interface BranchesRepo extends JpaRepository<Branches, Integer> {
	

	ResponseStructure<List<Branches>> getBranchesByHospitalId(int hid);

}
