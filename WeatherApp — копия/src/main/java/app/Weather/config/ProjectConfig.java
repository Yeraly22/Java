package app.Weather.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app.Weather.controller")
@EnableFeignClients(basePackages = "app.Weather.proxy")
public class ProjectConfig {
}
