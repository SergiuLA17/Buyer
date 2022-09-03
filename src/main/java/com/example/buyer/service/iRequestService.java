package com.example.buyer.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public interface iRequestService {
    void sendRequest(String url, Object object);
    ResponseEntity<?> getResponse();
}
