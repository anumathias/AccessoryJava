package com.example.Accessories.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Accessories.model.bracelets;
@Repository
public interface braceletsrepository extends JpaRepository<bracelets, Integer> {

}
