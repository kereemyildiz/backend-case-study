package com.dreamgames.casestudy.demo.repository;

import com.dreamgames.casestudy.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User,Long> {
}
