package com.stc.ConfigItem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigItemApplication.class, args);
	}
}
