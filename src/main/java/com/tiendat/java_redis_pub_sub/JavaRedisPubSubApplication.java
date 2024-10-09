package com.tiendat.java_redis_pub_sub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableScheduling
@SpringBootApplication
public class JavaRedisPubSubApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaRedisPubSubApplication.class, args);
	}

}
