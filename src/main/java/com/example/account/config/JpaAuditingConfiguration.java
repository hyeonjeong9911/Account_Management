package com.example.account.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// @EntityListeners 를 사용하기 위한 설정
@Configuration
@EnableJpaAuditing
public class JpaAuditingConfiguration {
}
