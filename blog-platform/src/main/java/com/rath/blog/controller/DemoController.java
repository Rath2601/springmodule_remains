package com.rath.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping
	public String hello() {
		return "Hello World!";
	}
	
	@RequestMapping("/name")
	public String gethello(@RequestParam String q) {
		return "Hello "+q;
	}
}
