package com.hcl.demospringboot10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.demospringboot10.dto.Fruit;

@RestController
public class PracticeController {
	@GetMapping("/demo")
	public void name()
	{
		System.out.println("demo api is hit");
	}
	@GetMapping("/manasi")
	public String name1()
	{
		return ("manasi first api");
	}
//	@PostMapping("/savefruit")
//	public void saveFruit(@RequestBody Fruit fruit)
//	{
//		System.out.println(fruit);
//	}
	@PostMapping("/savefruit")
	public Fruit saveFruit(@RequestBody Fruit fruit)
	{
//		System.out.println(fruit);
		return fruit;
	}

}
