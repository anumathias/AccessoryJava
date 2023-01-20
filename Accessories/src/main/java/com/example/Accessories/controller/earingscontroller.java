package com.example.Accessories.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Accessories.model.earings;
import com.example.Accessories.model.rings;
import com.example.Accessories.repository.earingsrepository;
import com.example.Accessories.repository.ringsrepository;

@RestController
public class earingscontroller {
	@Autowired
	private earingsrepository earingsRepository;
	
	
	@GetMapping("/earings")
	public List<earings> getAllrings()
	{
		return earingsRepository.findAll();
	}
}
