package com.example.log4jtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;

@SpringBootApplication(exclude = {WebMvcAutoConfiguration.class})
public class Log4jtestApplication {

	private static Logger logger = LoggerFactory.getLogger(Log4jtestApplication.class);

	public static void main(String[] args) {
		logger.info("this is working");
		SpringApplication.run(Log4jtestApplication.class, args);
	}

}
