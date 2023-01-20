package com.example.Accessories.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Accessories.model.rings;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Repository
public interface ringsrepository extends JpaRepository<rings, Integer> {

}
