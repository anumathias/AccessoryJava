package com.example.Accessories.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Accessories.model.creditcard;
import com.example.Accessories.model.users;
@Repository
public interface creditcardrepository extends JpaRepository<creditcard, Integer> {
	List<creditcard> findByCvv(String cvv);
}
