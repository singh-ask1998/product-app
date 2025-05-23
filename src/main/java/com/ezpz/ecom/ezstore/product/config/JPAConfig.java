package com.ezpz.ecom.ezstore.product.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
//@ComponentScan(basePackages = "com.ezpz.ecom.ezstore.product")
@EntityScan(basePackages = "com.ezpz.ecom.ezstore.product")
@EnableJpaRepositories(basePackages = "com.ezpz.ecom.ezstore.product")
public class JPAConfig {

}
