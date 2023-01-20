package com.example.Accessories.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Accessories.model.earings;
@Repository
public interface earingsrepository extends JpaRepository<earings, Integer> {

}
