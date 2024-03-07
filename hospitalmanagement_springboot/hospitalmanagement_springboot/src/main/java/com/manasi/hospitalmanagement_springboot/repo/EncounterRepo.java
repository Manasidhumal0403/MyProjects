package com.manasi.hospitalmanagement_springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manasi.hospitalmanagement_springboot.dto.Encounter;

public interface EncounterRepo extends JpaRepository<Encounter, Integer>{

}
