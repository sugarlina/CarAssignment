package com.example.demo.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}



//		Ограничения:
//		- един автомобил може да има само 1 двигател
//		- един автомобил може да има само 1 марка и 1 модел
//		- един човек може да притежава множество автомобили

//		Prerequisites:
//		- да се добавят данни за поне 3 автомобила и 2 собственици