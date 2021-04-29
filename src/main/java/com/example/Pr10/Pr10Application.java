package com.example.Pr10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Pr10Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Pr10Application.class, args);
		Programmer senior = context.getBean("senior", Programmer.class);
		senior.doCoding();

		Programmer junior = context.getBean("junior", Programmer.class);
		junior.doCoding();

		Programmer middle = context.getBean("middle", Programmer.class);
		middle.doCoding();
	}

}
