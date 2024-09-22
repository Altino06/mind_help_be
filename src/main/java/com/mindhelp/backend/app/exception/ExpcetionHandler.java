package com.mindhelp.backend.app.exception;

import com.mindhelp.backend.domain.exception.NotFoundException;
import com.mindhelp.backend.domain.exception.ObjectsAreEqualsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExpcetionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<HandlerShape> notFoundEx(Exception e) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        String message = e.getMessage();
        HandlerShape shape = HandlerShape.builder()
                .statusCode(status.value())
                .message(message)
                .build();
        return ResponseEntity.status(status).body(shape);
    }

    @ExceptionHandler(ObjectsAreEqualsException.class)
    public ResponseEntity<HandlerShape> objAreEqualsEx(Exception e) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        String message = e.getMessage();
        HandlerShape shape = HandlerShape.builder()
                .statusCode(status.value())
                .message(message)
                .build();
        return ResponseEntity.status(status).body(shape);
    }
}
