package com.example.project01.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testContoller {

	@GetMapping("/test")
	public String test() {
		return "hello world";
	}
}
