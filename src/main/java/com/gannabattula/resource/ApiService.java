package com.gannabattula.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/apiservice")
public class ApiService {
	
	@GET
	@Produces("application/json")
	public String getName() {
		return "Sree Maa";
		
	}
}
