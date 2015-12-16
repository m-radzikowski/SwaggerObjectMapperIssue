package com.example.restdatetest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class TestFacade {
	
	@Path("/test")
	@GET
	public Model test() {
		return new Model();
	}

}
