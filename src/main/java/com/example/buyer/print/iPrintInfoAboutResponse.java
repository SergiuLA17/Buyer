package com.example.buyer.print;

import org.springframework.http.ResponseEntity;

public interface iPrintInfoAboutResponse {
    void print(ResponseEntity<String> response);
}
