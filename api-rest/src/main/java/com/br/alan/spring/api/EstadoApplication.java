package com.br.alan.spring.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class EstadoApplication {
	public static void main(String[] args) {
		SpringApplication.run(EstadoApplication.class, args);
	}

}
