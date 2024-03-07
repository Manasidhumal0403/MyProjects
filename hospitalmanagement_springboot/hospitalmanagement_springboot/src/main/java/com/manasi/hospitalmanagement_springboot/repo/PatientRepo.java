package com.manasi.hospitalmanagement_springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manasi.hospitalmanagement_springboot.dto.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer>{

}
