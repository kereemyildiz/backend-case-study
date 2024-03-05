package com.dreamgames.casestudy.demo.service.impl;

import com.dreamgames.casestudy.demo.dto.ProgressData;
import com.dreamgames.casestudy.demo.entity.User;
import com.dreamgames.casestudy.demo.exceptions.UserAlreadyInTournamentException;
import com.dreamgames.casestudy.demo.exceptions.UserNotClaimedAwardException;
import com.dreamgames.casestudy.demo.exceptions.UserNotEligibleException;
import com.dreamgames.casestudy.demo.exceptions.UserNotFoundException;
import com.dreamgames.casestudy.demo.repository.UserRepository;
import com.dreamgames.casestudy.demo.service.ITournamentService;
import com.dreamgames.casestudy.demo.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TournamentService implements ITournamentService {

    private final UserRepository userRepository;
    private final IUserService userService;
    @Override
    public String enterTournament(long userId) {
        // check user exists
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + userId));

        // check user already joined
        if (user.isInTournament()) {
            throw new UserAlreadyInTournamentException("You are already joined.");
        }

        // check user claimed
        if (!user.isClaimed()) {
            throw new UserNotClaimedAwardException("Please first claim your award from previous tournament. Then, try again.");
        }

        if (!userService.isUserEligibleToJoin(userId)) {
            throw new UserNotEligibleException("You are not eligible to join the tournament. You must be at least 20 and pay 1000 coins to participate.");
        }

        // TODO:check if tournament started
        // TODO: wait user until 5 people from different country sends join tournament request. When we found them,create a tournamentgroup.

        return null;
    }

    @Override
    public ProgressData claimReward(long userId) {
        return null;
    }
}
