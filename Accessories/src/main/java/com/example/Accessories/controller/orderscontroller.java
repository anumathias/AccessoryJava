package com.example.Accessories.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Accessories.model.orders;
import com.example.Accessories.model.rings;
import com.example.Accessories.repository.ordersrepository;
import com.example.Accessories.repository.ringsrepository;

@RestController
public class orderscontroller {
	@Autowired
	private ordersrepository ordersRepository;
	
	
	@GetMapping("/orders")
	public List<orders> getAllrings()
	{
		return ordersRepository.findAll();
	}
}
