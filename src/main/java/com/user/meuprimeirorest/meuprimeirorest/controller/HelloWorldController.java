package com.user.meuprimeirorest.meuprimeirorest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World";
	}
	
	@PostMapping("/hellopost")
	public String helloPost(String nome) {
		return "Hello Post " + nome + "!";
	}
}
