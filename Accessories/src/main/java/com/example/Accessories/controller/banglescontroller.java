package com.example.Accessories.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Accessories.model.bangles;
import com.example.Accessories.model.bracelets;
import com.example.Accessories.repository.banglesrepository;
import com.example.Accessories.repository.braceletsrepository;

@RestController
public class banglescontroller {
	@Autowired
	private banglesrepository banglesRepository;
	
	
	@GetMapping("/bangles")
	public List<bangles> getAllrings()
	{
		return banglesRepository.findAll();
	}
}
