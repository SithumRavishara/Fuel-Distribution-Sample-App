package com.sithum.FuelDistributionSampleApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FuelDistributionSampleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuelDistributionSampleAppApplication.class, args);
	}

}
