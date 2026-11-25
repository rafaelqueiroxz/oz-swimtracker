package com.rafaelqueiroz.oz_swimtracker;

import org.springframework.boot.SpringApplication;

public class TestOzSwimtrackerApplication {

	public static void main(String[] args) {
		SpringApplication.from(OzSwimtrackerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
