package com.dreamgames.casestudy.demo.repository;

import com.dreamgames.casestudy.demo.entity.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRepository extends JpaRepository<Tournament,Long> {

}
