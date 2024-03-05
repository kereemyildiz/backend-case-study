//package com.dreamgames.casestudy.demo.entity;
//
//import jakarta.persistence.*;
//
//@Entity
//public class GameGroupInfo {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "group_id")
//    private TournamentGroup tournamentTournamentGroup;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id")
//    private User user;
//
//    private int userScore; // User's score in the group
//
//    // Getters and setters
//}