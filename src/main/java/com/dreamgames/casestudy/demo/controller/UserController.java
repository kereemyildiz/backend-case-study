package com.dreamgames.casestudy.demo.controller;


import com.dreamgames.casestudy.demo.dto.ProgressData;
import com.dreamgames.casestudy.demo.entity.User;
import com.dreamgames.casestudy.demo.exceptions.UserAlreadyExistsException;
import com.dreamgames.casestudy.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestParam String username) {
//
        return new ResponseEntity<User>(userService.createUser(username), HttpStatus.CREATED);


    }

    @PutMapping("/{userId}/updateLevel")
    public ResponseEntity<ProgressData> updateLevel(@PathVariable Long userId) {

            return new ResponseEntity<ProgressData>(userService.updateLevel(userId), HttpStatus.OK);

    }

}
