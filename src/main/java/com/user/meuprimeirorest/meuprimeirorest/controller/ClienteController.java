package com.user.meuprimeirorest.meuprimeirorest.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.meuprimeirorest.meuprimeirorest.dto.Cliente;


@RestController
public class ClienteController {
	
	@PostMapping(path = "clientes/novo", consumes = "application/json")
	public void novoCliente(@RequestBody @Valid Cliente cliente) {
		
		System.out.println(
				"Nome do cliente: " + cliente.getNome()
				+ " " + cliente.getSobrenome() + " | " + "Idade do cliente: " +
						cliente.getIdade());
	}
}
