package com.assignment.springboot;

import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.persistence.EntityManagerFactory;

@Configuration
public class TestConfig {

    @Bean
    public TestEntityManager testEntityManager(EntityManagerFactory entityManagerFactory) {
        return new TestEntityManager(entityManagerFactory);
    }
}



