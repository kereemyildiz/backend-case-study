package com.dreamgames.casestudy.demo.entity;

import com.dreamgames.casestudy.demo.enums.Country;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
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
        // TODO: FIX MAGICAL INITIALIZATION
        this.username = username;
        this.level = 1;
        this.coins = 5000;
        this.country = Country.TURKEY;
    }


}