package com.example.demo.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import com.example.demo.models.DogType;
import com.example.demo.models.NewDogType;
import com.example.demo.repositories.DogTypeRepository;

@RestController
@RequestMapping("/dogs")
public class DogTypeController {

	@Autowired
	private DogTypeRepository dogTypeRepository;

	@GetMapping("/dogs/types")
	public ResponseEntity<List<DogType>> listDogTypes() {
		return new ResponseEntity<>(dogTypeRepository.findAll(), HttpStatus.OK);
	}

	@GetMapping("/dogs/types/{id}")
	public ResponseEntity<DogType> getDogType(@PathVariable int id) {
		Optional<DogType> dogTypeOptional = dogTypeRepository.findById(id);
		if (dogTypeOptional.isPresent()) {
			return new ResponseEntity<>(dogTypeOptional.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/dogs/types")
	public ResponseEntity<DogType> createDogType(@RequestBody NewDogType newDogType) {
		DogType persistedDogType = new DogType(newDogType);
		return new ResponseEntity<>(dogTypeRepository.save(persistedDogType), HttpStatus.OK);
	}

	@PutMapping("/dogs/types/{id}")
	public ResponseEntity<DogType> updateDogType(@RequestBody NewDogType newDogType, @PathVariable int id) {
		DogType persistedDogType;
		Optional<DogType> dogTypeOptional = dogTypeRepository.findById(id);
		if (dogTypeOptional.isPresent()) {
			persistedDogType = dogTypeOptional.get();
			persistedDogType.updateDogType(newDogType);
		} else {
			persistedDogType = new DogType(newDogType);
		}
		return new ResponseEntity<>(dogTypeRepository.save(persistedDogType), HttpStatus.OK);
	}

	@DeleteMapping("/dogs/types/{id}")
	public ResponseEntity<DogType> deleteDogType(@PathVariable int id) {
		Optional<DogType> dogTypeOptional = dogTypeRepository.findById(id);
		if (dogTypeOptional.isPresent()) {
			dogTypeRepository.delete(dogTypeOptional.get());
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}