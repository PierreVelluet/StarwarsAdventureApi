package com.peyo.StarwarsAdventureApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.peyo.StarwarsAdventureApi.rest.StarwarsApiController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class StarwarsAdventureApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarwarsAdventureApiApplication.class, args);
	}

}
