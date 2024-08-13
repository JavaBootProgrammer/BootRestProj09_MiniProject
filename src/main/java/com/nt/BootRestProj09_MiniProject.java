package com.nt;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan({ "com.nt.model" })
@SpringBootApplication
public class BootRestProj09_MiniProject {

	public static void main(String[] args) {

		SpringApplication.run(BootRestProj09_MiniProject.class, args);
	}

}
