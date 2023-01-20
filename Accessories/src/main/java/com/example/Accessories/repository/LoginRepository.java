package com.example.Accessories.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Accessories.model.login;

public interface LoginRepository extends JpaRepository<login, Integer> {
	login findByUsername (String username);
}
