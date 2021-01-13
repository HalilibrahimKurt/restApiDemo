package com.springboot.demo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	@GetMapping("/")
	public String get() {
		return "Laptop";
	}
	
	@GetMapping("/products")
	public String get2() {
		return "HP OMEN İ7 9750H GTX 1660Tİ";
	}
}
