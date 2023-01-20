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
@Table(name="orders")
public class orders implements Serializable{
	@Id
   private int id;
   private String name;
   private int price;
   
  
   @ManyToOne(fetch = FetchType.LAZY, optional = false)
   @JoinColumn(name="userid",nullable = false)
   @Access(AccessType.PROPERTY)
   private users users;

public orders(String name, int price,
		com.example.Accessories.model.users users) {
	super();
	this.name = name;
	this.price = price;
	
	this.users = users;
}
public orders() {
	super();
	// TODO Auto-generated constructor stub
}
//@Override
//public String toString() {
//	return "orders [id=" + id + ", name=" + name + ", price=" + price + "]";
//}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPname() {
	return name;
}
public void setPname(String pname) {
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
