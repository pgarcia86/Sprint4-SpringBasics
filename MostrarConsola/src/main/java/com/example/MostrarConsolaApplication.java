package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.service.IPersonaService;
@SpringBootApplication
public class MostrarConsolaApplication implements CommandLineRunner{

	
	@Autowired	//CON ESTA ANOTACION INSTANCIO UN OBJETO DE LA CLASE IPersonaService QUE ES
				//IMPLEMENTADA POR IPersonaServiceImpl
	private IPersonaService service;
	
	
	public static void main(String[] args) {
		SpringApplication.run(MostrarConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		service.registrar("Roberto");
	}

}
