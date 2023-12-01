package com.dreamgames.casestudy.demo.entity;

import com.dreamgames.casestudy.demo.enums.Country;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
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


}