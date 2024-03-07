package com.manasi.hospitalmanagement_springboot.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.manasi.hospitalmanagement_springboot.dto.MedOrder;
import com.manasi.hospitalmanagement_springboot.service.MedOrderService;
import com.manasi.hospitalmanagement_springboot.util.ResponseStructure;

@RestController
@RequestMapping("/medorder")
public class MedOrderController {
	@Autowired
	private MedOrderService medOrderService;

	@PostMapping
	public ResponseStructure<MedOrder> saveMedorder(@RequestBody MedOrder medOrder,@RequestParam int eid) {
		return medOrderService.saveMedorder(medOrder,eid);
	}
	@PutMapping
	public ResponseStructure<MedOrder> updateMedorder(MedOrder medOrder, int id) {
		return medOrderService.updateMedorder(medOrder,id);
	}
	@GetMapping
	public ResponseStructure<MedOrder> findMedorderid(@RequestParam int id) {
		return medOrderService.findMedorderid(id);
	}
	public ResponseStructure<MedOrder> deleteMedorder(@RequestParam int id) {
		return medOrderService.deleteMedorder(id);
	}
	
	
	@GetMapping("findAll")
	public ResponseStructure<List<MedOrder>> findAllMedorder(){
		return medOrderService.findAllMedorder();
	}
	
}
	
