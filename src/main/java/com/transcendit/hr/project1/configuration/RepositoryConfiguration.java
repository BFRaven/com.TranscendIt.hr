package com.transcendit.hr.project1.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.transcendit.hr.project1.domain"})
@EnableJpaRepositories(basePackages = {"com.transcendit.hr.project1.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
