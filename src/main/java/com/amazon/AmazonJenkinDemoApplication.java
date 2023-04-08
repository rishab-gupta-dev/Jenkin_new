package com.amazon;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.*;
@SpringBootApplication
public class AmazonJenkinDemoApplication implements CommandLineRunner {
	public static final Logger Logger= LoggerFactory.getLogger(AmazonJenkinDemoApplication.class);

	public static void main(String[] args) {
		Logger.info("its a CI pipeline job");
		SpringApplication.run(AmazonJenkinDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Logger.info("second log");
		
	}

}