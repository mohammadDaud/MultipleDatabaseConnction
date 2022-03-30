package com.db.spr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MultipleDatabasesConnectionApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(MultipleDatabasesConnectionApplication.class, args);
	}

}
