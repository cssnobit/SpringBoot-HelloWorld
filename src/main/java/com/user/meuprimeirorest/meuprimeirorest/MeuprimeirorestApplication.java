package com.user.meuprimeirorest.meuprimeirorest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.user.meuprimeirorest"})
public class MeuprimeirorestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuprimeirorestApplication.class, args);
	}

}
