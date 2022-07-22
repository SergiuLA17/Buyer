package com.example.buyer.service.Request;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public interface iRequest {
     ResponseEntity<String> send(String url,RestTemplate restTemplate);
}
