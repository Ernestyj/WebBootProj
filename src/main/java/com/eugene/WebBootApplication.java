package com.eugene;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({})
public class WebBootApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(WebBootApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.run(args);
	}
}
