package me.dio.gtf_dio_2024;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class GtfDio2024Application {

	public static void main(String[] args) {
		SpringApplication.run(GtfDio2024Application.class, args);
	}

}
