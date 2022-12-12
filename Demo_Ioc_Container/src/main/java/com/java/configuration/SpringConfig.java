package com.java.configuration;

import org.springframework.context.annotation.Configuration;

import com.java.bean.WelcomeBean;

import org.springframework.context.annotation.Bean;


@Configuration
public class SpringConfig {
	
	@Bean
	public WelcomeBean welcomeBean() {
		return new WelcomeBean();
	}

}