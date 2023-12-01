package com.dreamgames.casestudy.demo.service.impl;


import com.dreamgames.casestudy.demo.dto.ProgressData;
import com.dreamgames.casestudy.demo.entity.User;
import com.dreamgames.casestudy.demo.repository.UserRepository;
import com.dreamgames.casestudy.demo.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepository userRepository;
    @Override
    public User createUser(String username) {
        return null;
    }

    @Override
    public ProgressData updateLevel(Long userId) {
        return null;
    }
}
