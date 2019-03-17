package com.athome.gmall.cloudproviderserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudProviderserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudProviderserverApplication.class, args);
	}

}
