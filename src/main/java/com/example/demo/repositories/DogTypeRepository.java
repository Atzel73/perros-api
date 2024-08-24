package com.example.demo.repositories;

import org.springframework.data.jpa.repository.*;

import com.example.demo.models.DogType;


public interface DogTypeRepository extends JpaRepository<DogType, Integer>{
	
}
