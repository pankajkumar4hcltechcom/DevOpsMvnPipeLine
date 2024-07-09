package com.devopstest.mv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevOpsRestController {
	
	@GetMapping("/test1")
	public String test1() {
		System.out.println("In Test1 To test GISCM");
		return "test1";
	}
	

}
