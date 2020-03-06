package com.example.demo.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackageClasses = Local.class)
public class add {

	@Bean
	public Users getUsers() {
		return new Users("Ale","clos");
	}
}
