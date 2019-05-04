package com.company.Config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DBConfig {

    @Bean(name = "marveldb")
    @ConfigurationProperties(prefix = "spring.marvel_db")
    public DataSource marvelDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "marveldbJdbcTemplate")
    public JdbcTemplate marvelJdbcTemplate(@Qualifier("marveldb") DataSource marvelDataSource) {
        return new JdbcTemplate(marvelDataSource);
    }

    @Bean(name = "dcdb")
    @ConfigurationProperties(prefix = "spring.dc_db")
    public DataSource dcDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "dcJdbcTemplate")
    public JdbcTemplate dcJdbcTemplate(@Qualifier("dcdb") DataSource dcDataSource) {
        return new JdbcTemplate(dcDataSource);
    }
}
