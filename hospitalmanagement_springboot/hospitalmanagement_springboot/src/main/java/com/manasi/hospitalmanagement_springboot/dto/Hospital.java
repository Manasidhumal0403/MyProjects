package com.manasi.hospitalmanagement_springboot.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "Name can't be blank")
	@NotNull(message = "Name can't be null")
	private String name;
	@NotBlank(message = "Email can not be balnk")
	@NotNull(message = "Email can not be NULL")
	//@Email(regexp = "[a-z0-9.-+$]+@[a-z0-9]+\\.[a-z]{2,3}", message = "invalid email format")
	private String email;
	private String ceo;
//	@Autowired
//	private List<Branches> branches;
// 
}
