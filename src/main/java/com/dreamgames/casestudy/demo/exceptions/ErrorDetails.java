package com.dreamgames.casestudy.demo.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ErrorDetails {
    private LocalDate timestamp;
    private String message;
    private String details;
}
