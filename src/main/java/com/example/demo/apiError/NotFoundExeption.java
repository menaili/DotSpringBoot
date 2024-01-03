package com.example.demo.apiError;

import org.springframework.http.HttpStatus;

public class NotFoundExeption extends RuntimeException{
        public NotFoundExeption(String message) {
            super(message);
        }

        public HttpStatus getStatus() {
            return HttpStatus.NOT_FOUND;
        }
}
