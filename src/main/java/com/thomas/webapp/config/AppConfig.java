package com.thomas.webapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JpaConfig.class, WebConfig.class})
public class AppConfig {

}
