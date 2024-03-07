package com.manasi.hospitalmanagement_springboot.dao;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manasi.hospitalmanagement_springboot.dto.Hospital;
import com.manasi.hospitalmanagement_springboot.dto.MedOrder;
import com.manasi.hospitalmanagement_springboot.repo.MedorderRepo;

@Repository
public class MedOrderDao {
	@Autowired
	private MedorderRepo medorderRepo;

	public MedOrder saveMedorder(MedOrder medOrder) {
		// TODO Auto-generated method stub
		return medorderRepo.save(medOrder);
	}

	public MedOrder findMedorder(int id) {
		Optional<MedOrder>  optional=medorderRepo.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	public List<MedOrder> findAllMedorder() {// TODO Auto-generated method stub
		return medorderRepo.findAll();
	}

	

	public MedOrder deleteMedorder(int id) {
		
	Optional<MedOrder> optional= medorderRepo.findById(id);
	if (optional.isPresent()) {
		MedOrder medOrder=optional.get();
		medorderRepo.delete(medOrder);
		return medOrder;
	}
	return null;
	
}

	public MedOrder updateMedorder(MedOrder medOrder, int id) {
		Optional<MedOrder> optional=medorderRepo.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		medOrder.setId(id);
		return medOrder;
	}
//	s
	}
