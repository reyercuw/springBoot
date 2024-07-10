package com.shinyjourney.week1.Introduction.Introduction_To_SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner{

	@Autowired
	apple obj1;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args){

		obj1.eatMyApple();


		System.out.println("obj1 = "+ obj1.hashCode());
	}

}
