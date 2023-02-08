package com.thomas.webapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({WebConfig.class, JpaConfig.class})
public class AppConfig {

}
