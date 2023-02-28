package com.abrackgh.ExpenseManagementSuite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ExpenseManagementSuiteApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ExpenseManagementSuiteApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ExpenseManagementSuiteApplication.class, args);
	}

}
