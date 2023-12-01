package com.dreamgames.casestudy.demo.service.impl;


import com.dreamgames.casestudy.demo.constant.GameLogicConstants;
import com.dreamgames.casestudy.demo.dto.ProgressData;
import com.dreamgames.casestudy.demo.entity.User;
import com.dreamgames.casestudy.demo.exceptions.UserAlreadyExistsException;
import com.dreamgames.casestudy.demo.exceptions.UserNotFoundException;
import com.dreamgames.casestudy.demo.repository.UserRepository;
import com.dreamgames.casestudy.demo.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepository userRepository;
    @Override
    public User createUser(String username) {
        if (userRepository.findByUsername(username).isPresent()) {
            throw new UserAlreadyExistsException("User already exists with username: " + username);
        }

        User newUser = new User(username);
        return userRepository.save(newUser);
    }

    @Override
    public ProgressData updateLevel(Long userId) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + userId));

        int levelBeforeUpdate = user.getLevel();
        int coinsBeforeUpdate = user.getCoins();
        user.setLevel(levelBeforeUpdate + 1);
        user.setCoins(coinsBeforeUpdate + GameLogicConstants.COINS_PER_LEVEL);
        userRepository.save(user);

        return new ProgressData(userId, levelBeforeUpdate, coinsBeforeUpdate, user.getLevel(), user.getCoins());

    }
}
