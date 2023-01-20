package com.example.Accessories.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Accessories.model.orders;
@Repository
public interface ordersrepository extends JpaRepository<orders,Integer> {

}
