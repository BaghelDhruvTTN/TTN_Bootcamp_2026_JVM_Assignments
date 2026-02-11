package com.assignment.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.core.env.Environment;


@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringbootApplication.class, args);

		// For Question2
		// Environment env = context.getEnvironment();

		// System.out.println("Name is : "+ env.getProperty("app.name"));
		// System.out.println("Version is : "+ env.getProperty("app.version"));
		// System.out.println("Author is : "+ env.getProperty("app.author"));

	}

}
