package com.manasi.hospitalmanagement_springboot.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manasi.hospitalmanagement_springboot.dto.Encounter;
import com.manasi.hospitalmanagement_springboot.repo.EncounterRepo;
@Repository
public class EncounterDao {
	@Autowired
	private EncounterRepo encounterRepo;

	public Encounter saveEncounter(Encounter encounter) {
		// TODO Auto-generated method stub
		return encounterRepo.save(encounter);
	}
	public Encounter findByid(int id) {
		Optional<Encounter> optional=encounterRepo.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		else
		{
		Encounter encounter= optional.get();
		 return encounter;
		}
	}

}
