package com.lin.boot.interface_common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class InterfaceCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterfaceCommonApplication.class, args);
	}
}
