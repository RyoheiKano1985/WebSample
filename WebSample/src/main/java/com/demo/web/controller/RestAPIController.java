package com.demo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {
	@GetMapping("/restapi")
	public String api() {
		System.out.println("api");
		return "api call";
	}

}
