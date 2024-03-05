package com.dreamgames.casestudy.demo.service;

import com.dreamgames.casestudy.demo.dto.ProgressData;
import com.dreamgames.casestudy.demo.entity.User;

public interface IUserService {
    User createUser(String username);
    ProgressData updateLevel(Long userId);

    boolean isUserEligibleToJoin(Long userId);
}
