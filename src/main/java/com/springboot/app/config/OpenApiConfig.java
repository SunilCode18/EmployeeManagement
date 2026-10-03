package com.springboot.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI employeeManagementAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Employee Management API")
						.description("REST API's for managing Employees")
						.version("1.0")
						);
	}

}
