package com.dreamgames.casestudy.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ProgressData {
    @JsonProperty("userId")
    private Long userId;

    @JsonProperty("previousLevel")
    private int previousLevel;

    @JsonProperty("previousCoins")
    private int previousCoins;

    @JsonProperty("updatedLevel")
    private int updatedLevel;

    @JsonProperty("updatedCoins")
    private int updatedCoins;


    // Other necessary data can be added in the future
}
