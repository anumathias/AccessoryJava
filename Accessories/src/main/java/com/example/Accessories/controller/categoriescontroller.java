package com.example.Accessories.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Accessories.model.categories;
import com.example.Accessories.model.earings;
import com.example.Accessories.repository.categoriesrepository;
import com.example.Accessories.repository.earingsrepository;

@RestController
public class categoriescontroller {
	@Autowired
	private categoriesrepository categoriesRepository;
	
	
	@GetMapping("/categories")
	public List<categories> getAllrings()
	{
		return categoriesRepository.findAll();
	}
}
