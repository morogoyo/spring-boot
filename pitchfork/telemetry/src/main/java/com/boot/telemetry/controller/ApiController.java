package com.boot.telemetry.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/api")
public class ApiController {	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@ResponseStatus(HttpStatus.CREATED)
	
    @RequestMapping(value="home", method = RequestMethod.POST , produces = "application/json")
	public String jsonReturn(@RequestBody String username ){		
		
		return username;
		
	}
	@RequestMapping(value="test")
	public String jsonReturn( ){		
		
		return "this is working";
		
	}
    
 
}