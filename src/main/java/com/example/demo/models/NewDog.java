package com.example.demo.models;

public class NewDog {
private int id;
private String dogName;
private int age;
private String color;
private int typeId;
public NewDog(String dogName, int age, String color, int typeId) {
    super();
    this.dogName = dogName;
    this.age = age;
    this.color = color;
    this.setTypeId(typeId);
}

public int getId() {
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
public int getTypeId() {
	return typeId;
}
public void setTypeId(int typeId) {
	this.typeId = typeId;
}
@Override
public String toString() {
     return "Dog [id=" + id + ", dogName=" + dogName + ", age=" + age + ", color=" + color + ", typeId=" +typeId+ "]";
}

}