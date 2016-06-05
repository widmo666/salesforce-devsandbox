package org.example.resources.utils;

import org.example.resources.customObjects.User;

public class UserUtil {

	public static User getStandardUser(){
		User user = new User();
		user.setFirstName("Michał");
		user.setLastName("Wójtowicz");
		user.setEmail("Michal.Wojtowicz@ttms.pl");
		user.setAdditionalInfo("Master of Java Webservices");
		
		return user;
	}
}
