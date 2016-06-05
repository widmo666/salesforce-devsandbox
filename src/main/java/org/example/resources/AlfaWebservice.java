package org.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alfa")
public class AlfaWebservice {

	@POST
	@Produces("text/plain")
	public String testWebservicePOST(){
		return "Webservice OK";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String testWebserviceGET(){
		return "Webservice OK";
	}
}
