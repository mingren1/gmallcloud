package com.athome.gmall.cloudhystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class CloudHystrixdashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudHystrixdashboardApplication.class, args);
	}

}
