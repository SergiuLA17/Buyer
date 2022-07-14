package com.example.buyer.service.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface iResponse {
    void create(ResponseEntity<String> response);
    HttpStatus getStatusCode();
    ResponseEntity<String> getResponse();

}
