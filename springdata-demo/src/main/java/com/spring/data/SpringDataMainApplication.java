package com.spring.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.data.dao.CustomerRepository;

@SpringBootApplication
public class SpringDataMainApplication {

	@Autowired
	CustomerRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataMainApplication.class, args);
	}

}
