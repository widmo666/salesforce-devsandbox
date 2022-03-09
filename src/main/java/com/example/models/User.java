package com.example.models;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	
	public String firstName;
	public String lastName;
	public String email;
	public String description;
	public String specialInformation;
	
	public User(){
		this.firstName = "hidden";
		this.lastName = "hidden";
		this.email = "hidden";
		this.description = "hidden"; 
		this.specialInformation = generateSpecialInformation();
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
	public String generateSpecialInformation() {
		try {
			String resutl = "";
			resutl += "Time: "+String.valueOf(new Date())+";";
			resutl += "FirstName: Michał;";
			resutl += "LastName: Wójtowicz;";
			resutl += "Email: michal.wojtowicz@billennium.com;";
			resutl += "Description: Welcome down to my planet Hell;";
			return Base64.getEncoder().encodeToString(resutl.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return "generateSpecialInformation FAIL!";
		}
	}
	public void setSpecialInformation(String specialInformation) {
		this.specialInformation = specialInformation;
	}

	public String getSpecialInformation() {
		return specialInformation;
	}
}
