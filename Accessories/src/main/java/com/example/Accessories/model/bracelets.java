package com.example.Accessories.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="bracelets")
public class bracelets implements Serializable{
	@Id
	private int id;
	private String name;
	private String type;
	private int rating;
	private String price;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="cid",nullable = false)
	@Access(AccessType.PROPERTY)
	private categories categories;
	
	public bracelets(int id, String name, String type, String price, int rating) {
		super();
	
		this.name = name;
		this.type = type;
		this.price = price;
		this.rating = rating;
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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}
	

	public bracelets() {
		super();
		// TODO Auto-generated constructor stub
	}
	@JsonIgnore
	public categories getCategories() {
		return categories;
	}


	public void setCategories(categories categories) {
		this.categories = categories;
	}


	@Override
	public String toString() {
		return "bracelets [id=" + id + ", name=" + name + ", type=" + type + ", rating=" + rating + ", price=" + price
				+ ", categories=" + categories + "]";
	}
	
	
}