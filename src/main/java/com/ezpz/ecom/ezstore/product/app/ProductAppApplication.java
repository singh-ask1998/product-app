package com.ezpz.ecom.ezstore.product.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.ezpz.ecom.ezstore.product.config.JPAConfig;
import com.ezpz.ecom.ezstore.product.config.OpenAPIConfig;

@SpringBootApplication
@Import(OpenAPIConfig.class)
@EnableJpaAuditing
@EnableDiscoveryClient
public class ProductAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductAppApplication.class, args);
	}

}
