package com.example.models;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.jersey.core.util.Base64;

@XmlRootElement
public class User {
	
	public String firstName;
	public String lastName;
	public String email;
	public String description;
	public String specialInformation;
	
	public User(){
		this.firstName = "Michał";
		this.lastName = "Wójtowicz";
		this.email = "michal.wojtowicz@ttms.pl";
		this.description = "Author of this webservice";
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSpecialInformation() {
		specialInformation = "";
		specialInformation += "Time: "+String.valueOf(new Date())+";";
		specialInformation += "FirstName: "+ getFirstName()+";";
		specialInformation += "LastName: "+getLastName()+";";
		specialInformation += "Email: "+ getEmail()+";";
		specialInformation += "Description: "+ getDescription()+";";
		return String.valueOf(Base64.encode(specialInformation.getBytes()));
	}
	public void setSpecialInformation(String specialInformation) {
		this.specialInformation = specialInformation;
	}
}
