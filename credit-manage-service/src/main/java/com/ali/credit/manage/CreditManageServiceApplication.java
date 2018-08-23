package com.ali.credit.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.ali.credit.manage.mapper")
@ComponentScan(basePackages = "com.ali.credit")
public class CreditManageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditManageServiceApplication.class, args);
	}
}
