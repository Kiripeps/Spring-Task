package com.databaseTask.dbTask;

import org.springframework.boot.SpringApplication;

public class TestDbTaskApplication {

	public static void main(String[] args) {
		SpringApplication.from(DbTaskApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
