package com.example.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alfa")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class Alfa {

	@GET
	@Path("/test")
	public String getWebserviceTest(){
		return "Alfa Webservice OK!";
	}
}
