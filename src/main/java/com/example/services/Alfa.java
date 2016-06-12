package com.example.services;

import javax.ws.rs.Path;

@Path("/alfa")
public class Alfa {

	@Path("/test")
	public String getWebserviceTest(){
		return "Alfa Webservice OK!";
	}
}
