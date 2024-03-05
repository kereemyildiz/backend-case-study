package com.dreamgames.casestudy.demo.service;

import com.dreamgames.casestudy.demo.dto.ProgressData;

public interface ITournamentService {
    String enterTournament(long userId);
    ProgressData claimReward(long userId);


}
