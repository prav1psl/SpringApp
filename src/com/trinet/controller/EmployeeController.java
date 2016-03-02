package com.trinet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import com.trinet.dto.EmployeeDTO;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView helloWorld(){
 
		ModelAndView model = new ModelAndView("helloWorldPage");
		model.addObject("msg", "hello world");
 
		return model;
	}
	
	@RequestMapping(value="/enrollment",method=RequestMethod.POST)
	public ResponseEntity<String> addEmployee(@RequestBody EmployeeDTO employee){
		System.out.println("POST.request JSON.."+employee.toString());
		
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	
	@RequestMapping(value="/test",method=RequestMethod.POST,consumes="text/html",produces="text/html")
	public void testPOST(@RequestBody String name){
		System.out.println("in POST...."+name);
	}
}
