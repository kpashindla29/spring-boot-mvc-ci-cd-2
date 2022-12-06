package com.ab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.ab.controllers","com.ab.configs"})
public class SpringBootMvcCiCd2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcCiCd2Application.class, args);
	}

}
