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
@Table(name="cart")
public class cart implements Serializable {
    @Id
	private int id;
    private String name;
    private int price;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="userid",nullable = false)
    @Access(AccessType.PROPERTY)
    private users users;
    
    
	public cart(String name, int price, com.example.Accessories.model.users users) {
		super();
		this.name = name;
		this.price = price;
		this.users = users;
	}
	public cart() {
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@JsonIgnore
	public users getUsers() {
		return users;
	}
	public void setUsers(users users) {
		this.users = users;
	}
	
    
    
}
