package com.stacksimplify.restservices.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stacksimplify.restservices.pojo.UserDetails;

@RestController
public class HelloWorldController {

	//@RequestMapping(method = RequestMethod.GET, path ="/helloWorld")
	@GetMapping("/helloWorld1")
	public String helloWorld() {
		return "Hello World!!!!";
	}
	
	@GetMapping(value="/helloWorldBean",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public UserDetails helloWorldBean() {
		return new UserDetails("Goutham","Pavuluri","Hyderabad");
	}
}
