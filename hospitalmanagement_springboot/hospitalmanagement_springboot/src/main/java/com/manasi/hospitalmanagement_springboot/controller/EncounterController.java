package com.manasi.hospitalmanagement_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.manasi.hospitalmanagement_springboot.dto.Encounter;
import com.manasi.hospitalmanagement_springboot.service.EncounterServices;

@RestController
@RequestMapping("/encounter")
public class EncounterController {
	
	@Autowired
	private EncounterServices encounterServices;
	@PostMapping
	public Encounter saveEncounter(@RequestBody Encounter encounter,@RequestParam int pid,@RequestParam int bid) {
		return encounterServices.saveEncounter(encounter,pid,bid);
	}
	@GetMapping
	public Encounter findByid(int id) {
		return encounterServices.findByid(id);
	}

}
