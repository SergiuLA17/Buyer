package com.example.buyer.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface iBuyerService {
    ResponseEntity<?> sendRequest(String url, Object object);

}
