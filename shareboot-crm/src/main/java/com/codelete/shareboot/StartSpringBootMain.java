package com.codelete.shareboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling	// 启用间隔调度
public class StartSpringBootMain {
	public static void main(String[] args) {
		SpringApplication.run(StartSpringBootMain.class, args);
	}

}
