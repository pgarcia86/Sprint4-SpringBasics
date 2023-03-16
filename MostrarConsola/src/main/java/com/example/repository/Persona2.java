package com.example.repository;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.example.MostrarConsolaApplication;

import ch.qos.logback.classic.Logger;

@Repository
@Qualifier("persona2Qualifier")
public class Persona2 implements IPersona{

	private static Logger LOG = (Logger) LoggerFactory.getLogger(MostrarConsolaApplication.class);

	
	@Override
	public void registrar(String nombre) {
		
		LOG.info("SE REGISTRO EL USUARIO CON PERSONA 2: " + nombre);
		
	}

}