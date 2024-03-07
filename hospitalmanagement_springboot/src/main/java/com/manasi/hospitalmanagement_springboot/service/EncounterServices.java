package com.manasi.hospitalmanagement_springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.manasi.hospitalmanagement_springboot.dao.BranchDao;
import com.manasi.hospitalmanagement_springboot.dao.EncounterDao;
import com.manasi.hospitalmanagement_springboot.dao.PatientDao;
import com.manasi.hospitalmanagement_springboot.dto.Branches;
import com.manasi.hospitalmanagement_springboot.dto.Encounter;
import com.manasi.hospitalmanagement_springboot.dto.Patient;
@Service
public class EncounterServices {
	@Autowired
	private EncounterDao encounterDao;
	@Autowired
	private PatientDao patientDao;
	@Autowired
	 private BranchDao branchDao;

	public Encounter saveEncounter(Encounter encounter,int pid,int bid) {
		Patient patient=patientDao.getPatientById(pid);
		Branches  branches=branchDao.getBranch(bid);
		if (patient!= null && branches!= null) {
			encounter.setPatient(patient);
			List<Branches> listBranch=new ArrayList<>();
			listBranch.add(branches);
			encounter.setBranches(listBranch);
			return encounterDao.saveEncounter(encounter);
		}
		return null;
		
	}
	public Encounter findByid(int id) {
		return encounterDao.findByid(id);
	}

}
