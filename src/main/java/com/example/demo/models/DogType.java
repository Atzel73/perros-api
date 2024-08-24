package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "dog_type")

public class DogType{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "race", nullable = false, length = 50)
	private String race;
	@Column(name = "category", nullable = false, length = 50)
	private String category;
	
	public DogType() {
	}
	public DogType(int id, String race, String category) {
	    super();
	    this.id = id;
	    this.race = race;
	    this.category = category;
	}
	public DogType(NewDogType newDogType) {
	    super();
	    this.id = newDogType.getId();
	    this.race = newDogType.getRace();
	    this.category = newDogType.getCategory();
	}
	public int getId() {
	    return id;
	}
	public void setId(int id) {
	    this.id = id;
	}
	public String getRace() {
	    return race;
	}
	public void setRace(String race) {
	    this.race = race;
	}
	public String getCategory() {
	    return category;
	}
	public void setCategory(String category) {
	    this.category = category;
	}
	public void updateDogType (NewDogType updateDogType) {
	    this.category = updateDogType.getCategory();
	    this.race = updateDogType.getRace();
	}
	@Override
	public String toString() {
	    return "DogType [id=" + id + ", race=" + race + ", category=" + category + "]";
	}
}