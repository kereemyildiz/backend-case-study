package com.dreamgames.casestudy.demo.repository;

import com.dreamgames.casestudy.demo.entity.TournamentGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameGroupRepository extends JpaRepository<TournamentGroup, Long> {
    // Custom queries if needed
}
