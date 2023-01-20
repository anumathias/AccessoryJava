package com.example.Accessories.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Accessories.model.users;


@Repository
public interface usersrepository extends JpaRepository<users, Integer>{
	
	List<users> findByEmail(String email);
}
