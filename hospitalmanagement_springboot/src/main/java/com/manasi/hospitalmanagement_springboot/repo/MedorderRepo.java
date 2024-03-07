package com.manasi.hospitalmanagement_springboot.repo;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.manasi.hospitalmanagement_springboot.dto.MedOrder;

public interface MedorderRepo extends JpaRepository<MedOrder, Integer> {
   @Query("SELECT m FROM MedOrder m WHERE m.date=?1")
	Date getMedOrderByDate();

}
