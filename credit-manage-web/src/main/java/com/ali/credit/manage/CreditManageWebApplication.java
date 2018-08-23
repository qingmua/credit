package com.ali.credit.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ali.credit")
public class CreditManageWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditManageWebApplication.class, args);
	}
}
