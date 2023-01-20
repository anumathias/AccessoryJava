package com.example.Accessories.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name="users")
public class users implements Serializable {
  @Id
  @Column(name = "id", unique = true , nullable = false)
  private int id;
  @Column(name="Firstname")
  private String firstname;
  @Column(name="Lastname")
  private String lastname;
  private String email;
  //@Column(name="password")
  private String password;
  private String phonenumber;
  private String address;
  
  @OneToMany(mappedBy = "users",targetEntity =orders.class, fetch = FetchType.LAZY,cascade = CascadeType.ALL) 
  private List<orders> orders;
  
  
 
  
  @OneToMany(mappedBy = "users",targetEntity =creditcard.class, fetch = FetchType.LAZY,cascade = CascadeType.ALL) 
  private List<creditcard> creditcards;


  @OneToMany(mappedBy = "users",targetEntity =cart.class, fetch = FetchType.LAZY,cascade = CascadeType.ALL) 
  private List<cart> cart;
  
public users(int id, String firstname, String lastname, String email, String password, String phonenumber,
		String address) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.password = password;
	this.phonenumber = phonenumber;
	this.address = address;
}



public List<orders> getOrders() {
	return orders;
}



public void setOrders(List<orders> orders) {
	this.orders = orders;
}



public List<cart> getCart() {
	return cart;
}



public void setCart(List<cart> cart) {
	this.cart = cart;
}



public List<creditcard> getCreditcards() {
	return creditcards;
}

public void setCreditcards(List<creditcard> creditcards) {
	this.creditcards = creditcards;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}



public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getPhonenumber() {
	return phonenumber;
}

public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}



public users() {
	super();
}
  
}