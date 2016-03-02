package com.trinet.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.trinet.dto.EmployeeDTO;

@Path("/users")
public class RestController {

	/*@GET
	@Path("/text")
	public Response getUserXMLById() {
		System.out.println("in get...");
		return Response.status(200).entity("success").build();
	}*/

	@POST
	@Path("/enroll")
	@Consumes(MediaType.APPLICATION_JSON)	
	public Response addEmployee(EmployeeDTO dto){
		String result = "Product created : " + dto.toString();
		System.out.println("employee object:::"+dto.toString());
		  return Response.status(200)  
		            .entity(" Product added successfuly!<br> Id:20,  Name: hjhjhj"+result).build();  
	}
	
}
