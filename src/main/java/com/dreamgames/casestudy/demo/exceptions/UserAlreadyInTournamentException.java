package com.dreamgames.casestudy.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.BAD_REQUEST)
public class UserAlreadyInTournamentException extends RuntimeException {
    public UserAlreadyInTournamentException(String message) {
        super(message);
    }
}
