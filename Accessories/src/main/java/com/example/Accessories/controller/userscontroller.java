package com.example.Accessories.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Accessories.model.users;
import com.example.Accessories.repository.usersrepository;



@RestController
@RequestMapping
public class userscontroller {
	
	@Autowired
	private usersrepository usersRepository;
	
	@Autowired
	   private PasswordEncoder passwordEncoder;
	
	
	@GetMapping("/use")
	public List<users> getAllusers()
	{
		return usersRepository.findAll();
	}
	
//	       @PostMapping("/welcome")
//	       public users getWelcome(@RequestBody users user) {
//	           String username= user.getEmail();
//	           String password = user.getPassword();
//	           
//	           users findByUsername = (users) usersRepository.findByEmail(username);
//	           boolean status;
//
//	          if(findByUsername != null) {
//           if(password.equals(findByUsername.getPassword())) {
//	                   status = true;
//	               }
//	               else {
//	                   status = false;	               }
//         }
//	           else {
//	               status = false;
//	           }
//
//	          if(status) {
//	               //return "Login Successful";
//	               return findByUsername;
//	           }
//	           else {
//	               return null;	           }  
//	       }
	
//	@PostMapping
//	public users addUser(@RequestBody users user) {
//		return usersRepository.save(user);
//	}
	  @PostMapping("/add")
	  public ResponseEntity<String> registerusers(@RequestBody users user) {
          users savedFarmers = null;
          ResponseEntity response = null;
          try {
              String hashPwd=passwordEncoder.encode(user.getPassword());
              user.setPassword(hashPwd);
              savedFarmers = usersRepository.save(user);
              if (savedFarmers.getId() > 0) {
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

