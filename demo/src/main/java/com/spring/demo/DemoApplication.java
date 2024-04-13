package com.spring.demo;

import com.spring.demo.bar.HelloWorld;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(){
		return args -> {
			HelloWorld hello =new HelloWorld();
			hello.getHelloWorld();
		};
	}

}
