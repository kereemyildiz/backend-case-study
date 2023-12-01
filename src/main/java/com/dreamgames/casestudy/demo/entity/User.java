package com.dreamgames.casestudy.demo.entity;

import com.dreamgames.casestudy.demo.constant.GameLogicConstants;
import com.dreamgames.casestudy.demo.enums.Country;
import com.dreamgames.casestudy.demo.util.UserUtility;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;
    private int level;
    private int coins;

    @Enumerated(EnumType.STRING)
    private Country country;

    public User(String username) {
        this.username = username;
        this.level = GameLogicConstants.STARTING_LEVEL;
        this.coins = GameLogicConstants.INITIAL_COIN_COUNT;
        this.country = UserUtility.chooseRandomCountry();
    }


}