package com.manasi.hospitalmanagement_springboot.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;

@Entity
@Data
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	@NotBlank(message = "can not br blank")
	@NotNull(message = "can not bre emapty")
	 private String city;
	 private String state;
	 private int pincode;
	 

}
