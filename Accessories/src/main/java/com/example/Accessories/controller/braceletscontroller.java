package com.example.Accessories.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Accessories.model.bracelets;
import com.example.Accessories.model.cart;
import com.example.Accessories.repository.braceletsrepository;
import com.example.Accessories.repository.cartrepository;

@RestController
public class braceletscontroller {
	@Autowired
	private braceletsrepository braceletsRepository;
	
	
	@GetMapping("/bracelets")
	public List<bracelets> getAllrings()
	{
		return braceletsRepository.findAll();
	}
}
