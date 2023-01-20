package com.example.Accessories.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Accessories.model.login;
import com.example.Accessories.repository.LoginRepository;


@RestController
@RequestMapping
public class LoginController {
	@Autowired
    private LoginRepository loginRepository;



//  @Autowired
//private PasswordEncoder passwordEncoder;
       @PostMapping("/hi")
       public login getWelcome(@RequestBody login login) {
           String username = login.getUsername();
           String password = login.getPassword();
           
          login findByUsername = loginRepository.findByUsername(username);
           
           boolean status;

          if(findByUsername != null) {
               if(password.equals(findByUsername.getPassword())) {
                   status = true;
               }
               else {
                   status = false;
               }
           }
           else {
               status = false;
           }

          if(status) {
               //return "Login Successful";
               return findByUsername;
           }
           else {
               return null;
           }  
           
       }
}
