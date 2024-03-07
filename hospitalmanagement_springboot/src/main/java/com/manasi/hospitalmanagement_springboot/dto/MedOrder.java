package com.manasi.hospitalmanagement_springboot.dto;





import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Entity
@Data
public class MedOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	private Date date;
	private String doctor;
	@ManyToOne
	private Encounter encounter;
	

}
