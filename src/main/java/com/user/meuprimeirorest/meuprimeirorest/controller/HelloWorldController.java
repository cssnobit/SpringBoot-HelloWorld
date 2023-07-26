package com.user.meuprimeirorest.meuprimeirorest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String helloWorld(@RequestParam(value = "nome",
	defaultValue = "World") String nome) {
		
		return String.format("Hello %s!", this.capitalize(nome));
	}
	
	@PostMapping("/hellopost")
	public String helloPost(String nome) {
		return "Hello Post " + nome + "!";
	}
	
	private String capitalize(String nome) {
		String cap = nome.substring(0, 1).toUpperCase();
		return cap + nome.substring(1);
	}
}
