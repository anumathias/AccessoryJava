package com.example.Accessories.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Accessories.model.categories;
@Repository
public interface categoriesrepository extends JpaRepository<categories, Integer> {

}
