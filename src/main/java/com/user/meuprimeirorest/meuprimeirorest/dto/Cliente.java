package com.user.meuprimeirorest.meuprimeirorest.dto;

import javax.validation.constraints.NotNull;

public class Cliente {

	@NotNull
	private String nome;
	
	private String sobrenome;
	private Integer idade;
	
	public Cliente() {
		
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
}
