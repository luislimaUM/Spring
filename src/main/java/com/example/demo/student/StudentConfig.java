package com.example.demo.student;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(final StudentRepository repository) {
		return args -> {
			Student maria = new Student("maria", LocalDate.of(2015, 1, 8), "maria@example.com");
			Student alex = new Student("alex", LocalDate.of(2007, 1, 5), "alex@example.com");
			
			repository.saveAll(Arrays.asList(maria,alex));
		};
	}
}
