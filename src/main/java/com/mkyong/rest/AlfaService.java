package com.mkyong.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/alfa")
public class AlfaService {

	@GET
	@Path("/test")
	public String testWebservice(){
		return "Webservice OK!";
	}
}
