package com.manasi.hospitalmanagement_springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manasi.hospitalmanagement_springboot.dto.MedItem;

public interface MeditemRepo extends JpaRepository<MedItem, Integer>{

}
