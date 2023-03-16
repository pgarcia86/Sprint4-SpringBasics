package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.repository.IPersona;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired		//CON ESTA ANOTACION INSTANCIO UN OBJETO DE LA CLASE IPersona QUE ES
					//IMPLEMENTADA POR Persona
	@Qualifier("persona1Qualifier")
	private IPersona persona; 
	
	@Override
	public void registrar(String nombre) {	
		persona.registrar(nombre);	
		
	}

}
