package com.shinyjourney.week1.Introduction.Introduction_To_SpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Configuration
public class appleConfig {
    
    @Bean
    @Scope("singleton")
    apple getApple(){
        return new apple();
    }

    @PostConstruct
    void funcCallBeforeAppleisUsed(){
        System.out.println("This is a Functio Call Before Apple Bean is Used ! --__-- ");
    }

    @PreDestroy
    void funcCallBeforeAppleBeanisDestroyer(){
        System.out.println("This is a Functio Call Before Apple Bean is Destroyer ! --__-- ");
    }
}
