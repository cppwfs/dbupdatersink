package io.spring.demo;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
// import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DBUpdateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DBUpdateApplication.class, args);
	}

	@Bean
	public Consumer<String> process() {
		return  (payload) -> {
			System.out.println("****************************************");
			System.out.println(payload);
		};
	}
}
