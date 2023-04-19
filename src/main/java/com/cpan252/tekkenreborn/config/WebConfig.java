package com.cpan252.tekkenreborn.config;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login");
        registry.addViewController("/").setViewName("design.html");
        registry.addViewController("/").setViewName("authentication/login");
    }
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}