package com.example.Accessories.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Accessories.model.creditcard;
import com.example.Accessories.model.orders;
import com.example.Accessories.model.users;
import com.example.Accessories.repository.creditcardrepository;
import com.example.Accessories.repository.ordersrepository;

@RestController
public class creditcardcontroller {
	@Autowired
	private creditcardrepository creditcardRepository;
	
	@Autowired
	   private PasswordEncoder passwordEncoder;
	
	
	
	@GetMapping("/creditcard")
	public List<creditcard> getAllrings()
	{
		return creditcardRepository.findAll();
	}
	@PostMapping("/card")
	  public ResponseEntity<String> registerusers(@RequestBody creditcard credit) {
        creditcard savedAccessory = null;
        ResponseEntity response = null;
        try {
            String hashPwd=passwordEncoder.encode(credit.getCvv());
            credit.setCvv(hashPwd);
            savedAccessory = creditcardRepository.save(credit);
            if (savedAccessory.getCardnumber() > 0) {
                response = ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body("Given user details are successfully registered");
            }
        } catch (Exception ex) {
            response = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An exception occured due to " + ex.getMessage());
        }
        return response;
    }
		  
}
