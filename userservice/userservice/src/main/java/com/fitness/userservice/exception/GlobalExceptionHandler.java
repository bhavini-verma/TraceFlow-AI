package com.fitness.userservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmailAlreadyExistsException.class)
    public ResponseEntity<String> handleEmailAlreadyExists(EmailAlreadyExistsException ex) {
        // Return a 409 Conflict with the exception message
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }

    // You can add more handlers for other custom exceptions here
}
