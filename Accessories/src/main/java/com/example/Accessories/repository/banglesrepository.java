package com.example.Accessories.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Accessories.model.bangles;
@Repository
public interface banglesrepository extends JpaRepository<bangles, Integer>{

}
