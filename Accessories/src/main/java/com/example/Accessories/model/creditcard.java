package com.example.Accessories.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

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
@Table(name="creditcard")
public class creditcard implements Serializable {
  @Id
  private int Cardnumber;
 
  private String cvv;
 
  private String expiry_date;
 
  private String name;
  
  @NotFound(action = NotFoundAction.IGNORE)
  @ManyToOne(fetch = FetchType.LAZY, optional = true)
  @JoinColumn(name = "userid", insertable = true, updatable = true)
  @Access(AccessType.PROPERTY)
  private users users;


public String getExpiry_date() {
	return expiry_date;
}


public void setExpiry_date(String expiry_date) {
	this.expiry_date = expiry_date;
}


public int getCardnumber() {
	return Cardnumber;
}


public void setCardnumber(int cardnumber) {
	Cardnumber = cardnumber;
}


public String getCvv() {
	return cvv;
}


public void setCvv(String cvv) {
	this.cvv = cvv;
}





public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}

@JsonIgnore
public users getUsers() {
	return users;
}


public void setUsers(users users) {
	this.users = users;
}





public creditcard(String cvv, String expiry_date, String name, com.example.Accessories.model.users users) {
	super();
	this.cvv = cvv;
	this.expiry_date = expiry_date;
	this.name = name;
	this.users = users;
}


public creditcard() {
	super();
	// TODO Auto-generated constructor stub
}
  
 
  
}
