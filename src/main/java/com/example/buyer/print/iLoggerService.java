package com.example.buyer.print;

import org.springframework.http.ResponseEntity;

public interface iLoggerService {
    void info(String txt);
    void info(ResponseEntity<?> response);
}
