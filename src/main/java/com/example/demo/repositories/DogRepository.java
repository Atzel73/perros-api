package com.example.demo.repositories;

import org.springframework.data.jpa.repository.*;

import com.example.demo.models.Dog;




public interface DogRepository extends JpaRepository<Dog, Integer>{
	
}