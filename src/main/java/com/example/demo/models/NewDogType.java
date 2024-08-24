package com.example.demo.models;

public class NewDogType {

private int id;
private String race;
private String category;
public NewDogType(int id, String race, String category) {
    super();
    this.id = id;
    this.race = race;
    this.category = category;
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
@Override
public String toString() {
    return "DogType [id=" + id + ", race=" + race + ", category=" + category + "]";
}
}