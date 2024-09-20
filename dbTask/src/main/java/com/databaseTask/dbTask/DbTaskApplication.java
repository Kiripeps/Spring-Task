package com.databaseTask.dbTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DbTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbTaskApplication.class, args);

		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.databaseTask.dbTask");
	}

}
