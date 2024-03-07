package com.manasi.hospitalmanagement_springboot.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GeneratorType;
import org.yaml.snakeyaml.external.com.google.gdata.util.common.base.PercentEscaper;

import lombok.Data;
@Entity
@Data
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cause;
	private long cost;
	@ManyToOne
	private Patient patient;
	@OneToMany
	private List<Branches> branches;

}
