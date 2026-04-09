package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productclientcontroller {
	
	@GetMapping("Product")
	public String productService() {
		return "client product";
	}

}
