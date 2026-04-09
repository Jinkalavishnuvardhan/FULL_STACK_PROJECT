package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class clientcontroller {


	@GetMapping("hi")
	public String mtd() {
		return "hi welcome vishnu goog morning hello";
	}
}

