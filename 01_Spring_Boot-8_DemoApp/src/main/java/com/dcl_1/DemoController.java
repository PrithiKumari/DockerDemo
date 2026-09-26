package com.dcl_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/demo")
	public String demo() {
		return "welcome to Spring Boot";
		
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "This is just a starting of Spring Boot";
		
	}
	
	

}
