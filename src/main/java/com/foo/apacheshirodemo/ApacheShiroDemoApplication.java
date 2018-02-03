package com.foo.apacheshirodemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
@MapperScan(basePackages = {"com.foo.apacheshirodemo.mapper"})
public class ApacheShiroDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheShiroDemoApplication.class, args);
	}
}
