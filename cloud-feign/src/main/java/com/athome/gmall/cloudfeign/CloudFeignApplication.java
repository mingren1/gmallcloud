package com.athome.gmall.cloudfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@AutoConfigureAfter
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.athome.gmall.cloudfeign.cliet"})
@EnableEurekaClient
public class CloudFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudFeignApplication.class, args);
	}

}
