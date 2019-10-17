package com.lavi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqApplication implements CommandLineRunner{
	@Autowired
	Sender sender;
	
	public static void main(String[] args) {
		SpringApplication.run(RabbitMqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLineRunner run method");
		sender.send("Hello Naveeen");
	}
}
