package com.dreamgames.casestudy.demo.exceptions;

public class UserNotEligibleException extends RuntimeException {
    public UserNotEligibleException(String message) {
        super(message);
    }
}
