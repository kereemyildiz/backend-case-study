package com.dreamgames.casestudy.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public GameLogicConfig gameLogicConfig() {
        return new GameLogicConfig();
    }
    @Bean
    public TournamentConfig tournamentConfig() {
        return new TournamentConfig();
    }


}