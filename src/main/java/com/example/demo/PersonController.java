package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController {
	
	@RequestMapping("/hello")
	public String healthCheck() {
		return "Hello";
	}
	
	@RequestMapping("/hello/check")
	public String helloCheck() {
		return "HelloCheck";
	}
	
}
