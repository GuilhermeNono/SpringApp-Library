package me.nono.project.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@EnableCaching
@SpringBootApplication
public class StudyApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {

        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(final CorsRegistry registry) {
                registry.addMapping("/api/**")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedHeaders("Authorization", "Access-Control-Allow-Headers", "Origin", "Accept",
                                "X-Requested-With", "Content-Type", "Access-Control-Request-Method",
                                "Access-Control-Request-Headers", "Location", "Access-Control-Allow-Origin",
                                "Accept-Language")
                        .allowedOrigins("*")
                        .exposedHeaders("Location");
            }
        };
    }

}
