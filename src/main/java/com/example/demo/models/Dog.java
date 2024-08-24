package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "dog_list")

public class Dog{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "dog_name", nullable = false, length = 100)
	private String dogName;
	
	@Column(name = "age", nullable = false)
	private int age;
	
	@Column(name = "color", nullable = true)
	private String color;
	
	@ManyToOne
	@JoinColumn(name = "type_id")
	private DogType dogType;
	
	public Dog(){
		
	}
	
	public Dog(NewDog newDog, DogType newDogType) {
	    super();
	    this.dogName = newDog.getDogName();
	    this.age = newDog.getAge();
	    this.color = newDog.getColor();
	    this.dogType = newDogType;
	}
	
	public int getid() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDogName() {
	    return dogName;
	}
	public void setDogName(String dogName) {
	    this.dogName = dogName;
	}
	
	public int getAge() {
	    return age;
	}
	public void setAge(int age) {
	    this.age = age;
	}
	
	public String getColor() {
	    return color;
	}
	public void setColor(String color) {
	    this.color = color;
	}
	
	public DogType getDogType() {
	    return dogType;
	}
	public void setDogType(DogType dogType) {
	    this.dogType = dogType;
	}
	
	
	public void updateDog(NewDog updateDog, DogType updateDogType) {
	    this.dogName = updateDog.getDogName();
	    this.age = updateDog.getAge();
	    this.color = updateDog.getColor();
	    this.dogType = updateDogType;
	}
	
	@Override
	public String toString() {
	    return "Dog [id=" + id + ", dogName=" + dogName + ", age=" + age + ", color=" + color+ "]";
	}
	
	
}