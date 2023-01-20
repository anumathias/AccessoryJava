package com.example.Accessories.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Accessories.model.cart;
@Repository
public interface cartrepository extends JpaRepository<cart, Integer> {

}
