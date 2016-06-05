package org.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.example.resources.customObjects.User;
import org.example.resources.utils.UserUtil;

@Path("/alfa")
public class AlfaWebservice {

	@POST
	@Path("/testPOST")
	@Produces({ MediaType.TEXT_PLAIN })
	public String testWebservicePOST(){
		return "Webservice OK";
	}
	
	@GET
	@Path("/testGET")
	@Produces({ MediaType.TEXT_PLAIN })
	public String testWebserviceGET(){
		return "Webservice OK";
	}
	
//	@GET
//	@Path("/getUserJSON")
//	@Produces(MediaType.APPLICATION_JSON)
//	public User getStandardUserJSON(){ 
//		User user = UserUtil.getStandardUser();
//		return user;
//	}
//	
//	@GET
//	@Path("/getUserXML")
//	@Produces(MediaType.APPLICATION_XML)
//	public User getStandardUserXML(){
//		User user = UserUtil.getStandardUser();
//		return user;
//	}
}
