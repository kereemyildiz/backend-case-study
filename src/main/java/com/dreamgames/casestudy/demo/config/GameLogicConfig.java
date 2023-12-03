package com.dreamgames.casestudy.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="game")
public class GameLogicConfig {
    private int startingLevel;
    private int initialCoinCount;
    private int coinsPerLevel;

    public int getCoinsPerLevel() {
        return coinsPerLevel;
    }

    public void setCoinsPerLevel(int coinsPerLevel) {
        this.coinsPerLevel = coinsPerLevel;
    }

    public int getStartingLevel() {
        return startingLevel;
    }

    public void setStartingLevel(int startingLevel) {
        this.startingLevel = startingLevel;
    }

    public int getInitialCoinCount() {
        return initialCoinCount;
    }

    public void setInitialCoinCount(int initialCoinCount) {
        this.initialCoinCount = initialCoinCount;
    }


}
