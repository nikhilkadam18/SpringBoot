package com.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class FirststsprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirststsprojectApplication.class, args);
		System.out.println("starting.....");
	}

}
