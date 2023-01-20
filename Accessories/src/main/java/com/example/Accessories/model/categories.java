package com.example.Accessories.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="categories")
public class categories implements Serializable{
@Id	
 private int id;
 private String name;
 
 @OneToMany(mappedBy = "categories",targetEntity =bangles.class, fetch = FetchType.LAZY,cascade = CascadeType.ALL) 
 private List<bangles> bangles;
 
 @OneToMany(mappedBy = "categories",targetEntity =bracelets.class, fetch = FetchType.LAZY,cascade = CascadeType.ALL) 
 private List<bracelets> bracelets;
 
 @OneToMany(mappedBy = "categories",targetEntity =earings.class, fetch = FetchType.LAZY,cascade = CascadeType.ALL) 
 private List<earings> earings;

 @OneToMany(mappedBy = "categories",targetEntity =rings.class, fetch = FetchType.LAZY,cascade = CascadeType.ALL) 
 private List<rings> rings;
 
public categories(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public List<bangles> getBangles() {
	return bangles;
}
public void setBangles(List<bangles> bangles) {
	this.bangles = bangles;
}
public List<bracelets> getBracelets() {
	return bracelets;
}
public void setBracelets(List<bracelets> bracelets) {
	this.bracelets = bracelets;
}
public List<earings> getEarings() {
	return earings;
}
public void setEarings(List<earings> earings) {
	this.earings = earings;
}
public List<rings> getRings() {
	return rings;
}
public void setRings(List<rings> rings) {
	this.rings = rings;
}
public categories() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
 
}
