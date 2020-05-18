package com.javaadmirer.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello/{name}")
	public String sayHello( @PathVariable String name) {
		return "Hello " + name;
	}
	
	@GetMapping("/admin/hello/{name}")
	public String sayAdminHello( @PathVariable String name) {
		return "Hello " + name;
	}
}
