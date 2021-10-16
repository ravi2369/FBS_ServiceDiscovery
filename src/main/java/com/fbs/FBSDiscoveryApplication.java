package com.fbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FBSDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FBSDiscoveryApplication.class, args);
	}

}
