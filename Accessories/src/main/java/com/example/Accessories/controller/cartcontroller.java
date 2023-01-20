package com.example.Accessories.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Accessories.model.cart;
import com.example.Accessories.model.categories;
import com.example.Accessories.repository.cartrepository;
import com.example.Accessories.repository.categoriesrepository;

@RestController
public class cartcontroller {
	@Autowired
	private cartrepository cartrepository;
	
	
	@GetMapping("/carts")
	public List<cart> getAllrings()
	{
		return cartrepository.findAll();
	}
	

	 @PostMapping("/added")
	 public cart createCart(@RequestBody cart Cart) {
     return cartrepository.save(Cart);
     }


}
