package com.trinet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.trinet.dto.EmployeeDTO;

@Controller
@RequestMapping("/welcome")
public class HelloWorldController{
 
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView helloWorld(){
 
		ModelAndView model = new ModelAndView("helloWorldPage");
		model.addObject("msg", "hello world");
 
		return model;
	}
	
	@RequestMapping(value="/enrollment",method=RequestMethod.POST)
	public @ResponseBody EmployeeDTO addEmployee(@RequestBody EmployeeDTO employee){
		System.out.println("hello POST..."+employee.toString());
		
		return employee;
	}
	
	
	@RequestMapping(value="/test",method=RequestMethod.POST,consumes="text/html",produces="text/html")
	public void testPOST(@RequestBody String name){
		System.out.println("in POST...."+name);
	}
	
}
