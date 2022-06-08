package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"jp,com"})
@MapperScan(basePackages = "jp,com")
public class WebSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSampleApplication.class, args);
	}

}
