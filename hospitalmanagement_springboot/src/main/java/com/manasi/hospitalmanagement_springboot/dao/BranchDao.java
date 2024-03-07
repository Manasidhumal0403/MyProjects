package com.manasi.hospitalmanagement_springboot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manasi.hospitalmanagement_springboot.dto.Branches;
import com.manasi.hospitalmanagement_springboot.dto.Hospital;
import com.manasi.hospitalmanagement_springboot.repo.BranchesRepo;
import com.manasi.hospitalmanagement_springboot.util.ResponseStructure;

@Repository
public class BranchDao {
	@Autowired
	private BranchesRepo branchesRepo;
	@Autowired
	private HospitalDao dao;

	public Branches saveBranches(Branches branches) {
		// TODO Auto-generated method stub
		return branchesRepo.save(branches);
	}

	public List<Branches> findAllBranches() {
		// TODO Auto-generated method stub
		return branchesRepo.findAll();
	}

	public Branches getBranch(int b_id) {
		Optional<Branches> optional = branchesRepo.findById(b_id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	public Branches  deleteBranches(int id) {
		Optional<Branches> optional=branchesRepo.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		else {
			return optional.get();
		}
		
	}

	public Branches findBranchById(int id) {
		Optional<Branches> optional=branchesRepo.findById(id);
		if (optional.isPresent()) {
			 return optional.get();
		
		}
		else {
			return null;
		}
	}

	public ResponseStructure<List<Branches>> getBranchByHospitalId(int hid) {
		 return branchesRepo.getBranchesByHospitalId(hid);
		
	}

	

//	public List<Branches> getBranchByHospital(Hospital hospital) {
//		// TODO Auto-generated method stub
//		return branchesRepo.findBranchByHospital(hospital);
//	}

	

}
