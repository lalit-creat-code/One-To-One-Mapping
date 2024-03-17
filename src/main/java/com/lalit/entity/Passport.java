package com.lalit.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="Passport")
public class Passport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String PassportNo;
@OneToOne
@JoinColumn(name= "personId")
private Persons person;
public Passport() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPassportNo() {
	return PassportNo;
}
public void setPassportNo(String passportNo) {
	PassportNo = passportNo;
}
public Persons getPerson() {
	return person;
}
public void setPerson(Persons person) {
	this.person = person;
}

}
