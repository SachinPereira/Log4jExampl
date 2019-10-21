package com.example.Log4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Log4jApplication  extends SpringBootServletInitializer {
	private static final Logger LOGGER = LogManager.getLogger(Log4jApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4jApplication.class, args);

	}

}
