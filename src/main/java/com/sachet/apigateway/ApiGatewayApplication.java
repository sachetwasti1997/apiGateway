package com.sachet.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

}
/**
 * Without any routes also we can discover or handle routes via
 * apiGateway, we just need to have as url
 * http://localhost:8082/PRODUCT-SERVICE/products/get
 * --> localhost:8082 : ip of apiGateway
 * --> PRODUCT-SERVICE : name of product microservice in Eureka server
 * --> /products/get : end point name
 */