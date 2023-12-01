package com.dreamgames.casestudy.demo.service.impl;


import com.dreamgames.casestudy.demo.dto.ProgressData;
import com.dreamgames.casestudy.demo.entity.User;
import com.dreamgames.casestudy.demo.exceptions.UserAlreadyExistsException;
import com.dreamgames.casestudy.demo.repository.UserRepository;
import com.dreamgames.casestudy.demo.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepository userRepository;
    @Override
    public User createUser(String username) {
        Optional<User> existingUser = userRepository.findByUsername(username);

        if (existingUser.isPresent()) {
            throw new UserAlreadyExistsException("User already exists with username: " + username);
        }


        User newUser = new User(username);
        return userRepository.save(newUser);

    }

    @Override
    public ProgressData updateLevel(Long userId) {
        return null;
    }
}
