package com.ederson.curso.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ederson.curso.services.DbService;

@Configuration
@Profile("test")
public class TestCongig {
	
	@Autowired
	private DbService dbService;
	
	@Bean
	public boolean instantiateDataBase() throws ParseException{
		dbService.instantiateTestDataBase();
		return true;
	}
}
