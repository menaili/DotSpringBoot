package com.example.demo.apiError;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApiErrorController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundExeption.class)
    public ResponseEntity<ErrorMessage> handleApiExeptions(NotFoundExeption ex, WebRequest request) {
        ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorMessage, ex.getStatus());
    }
}

