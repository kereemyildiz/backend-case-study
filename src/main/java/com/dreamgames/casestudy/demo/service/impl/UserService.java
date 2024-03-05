package com.dreamgames.casestudy.demo.service.impl;


import com.dreamgames.casestudy.demo.config.GameLogicConfig;
import com.dreamgames.casestudy.demo.dto.ProgressData;
import com.dreamgames.casestudy.demo.entity.User;
import com.dreamgames.casestudy.demo.exceptions.UserAlreadyExistsException;
import com.dreamgames.casestudy.demo.exceptions.UserNotFoundException;
import com.dreamgames.casestudy.demo.repository.UserRepository;
import com.dreamgames.casestudy.demo.service.IUserService;
import com.dreamgames.casestudy.demo.util.UserUtility;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final GameLogicConfig gameLogicConfig;

    private final UserRepository userRepository;
    @Override
    public User createUser(String username) {
        if (userRepository.findByUsername(username).isPresent()) {
            throw new UserAlreadyExistsException("User already exists with username: " + username);
        }

        User newUser = new User(username,
                gameLogicConfig.getStartingLevel(),
                gameLogicConfig.getInitialCoinCount(),
                UserUtility.chooseRandomCountry());

        return userRepository.save(newUser);
    }

    @Override
    public ProgressData updateLevel(Long userId) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + userId));

        int levelBeforeUpdate = user.getLevel();
        int coinsBeforeUpdate = user.getCoins();
        user.setLevel(levelBeforeUpdate + 1);
        user.setCoins(coinsBeforeUpdate + gameLogicConfig.getCoinsPerLevel());
        userRepository.save(user);

        return new ProgressData(userId, levelBeforeUpdate, coinsBeforeUpdate, user.getLevel(), user.getCoins());

    }

    @Override
    public boolean isUserEligibleToJoin(Long userId) {
        Optional<User> user = userRepository.findById(userId); // we already check user's existence.
        return user.get().getCoins() >= 1000 && user.get().getLevel() >= 20;
    }
}
