package com.gerenciadorTarefas.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataBaseConfig {

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:sqlite:taskdb.db")
                .driverClassName("org.sqlite.JDBC")
                .build();
    }
}
