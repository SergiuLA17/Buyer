package com.example.buyer.service;

import com.example.buyer.service.restTemplate.customRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class RequestService implements iRequestService {
    @Autowired
    private customRestTemplate restTemplate;
    private ResponseEntity<?> response;

    public void sendRequest(String url, Object object){
        response = restTemplate.create().postForEntity(url, object, String.class);
    }

    public ResponseEntity<?> getResponse(){
        return response;
    }

}
