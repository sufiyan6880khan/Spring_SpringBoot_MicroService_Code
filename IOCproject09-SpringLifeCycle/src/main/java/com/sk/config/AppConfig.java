package com.sk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.sk.sbeans")
@PropertySource("com/sk/common/PersonInfo.properties")
public class AppConfig {

}
