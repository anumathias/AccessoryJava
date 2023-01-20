package com.example.Accessories.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Accessories.model.rings;

import com.example.Accessories.repository.ringsrepository;


@RestController
public class ringscontroller {
	@Autowired
	private ringsrepository ringsRepository;
	
	
	@GetMapping("/rings")
	public List<rings> getAllrings()
	{
		return ringsRepository.findAll();
	}
}
