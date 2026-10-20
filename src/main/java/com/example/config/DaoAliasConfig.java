package com.example.config;

import com.example.dao.DaoApi;
import com.example.dao.IDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoAliasConfig {

    @Bean
    public IDao daoAlias() {
        // Pointe vers l'implémentation API
        return new DaoApi();
    }
}
