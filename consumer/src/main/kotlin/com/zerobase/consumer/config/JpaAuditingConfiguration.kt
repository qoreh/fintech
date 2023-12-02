package com.zerobase.consumer.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories(basePackages = ["com.zerobase.domain"])
@EnableJpaAuditing
class JpaAuditingConfiguration {
}