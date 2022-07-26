package com.example.buyer.service.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ResponseController implements iResponseController{
    private  ResponseEntity<String> response;


    public void create(ResponseEntity<String> response) {
        this.response = response;
    }

    public HttpStatus getStatusCode(){
        return response.getStatusCode();
    }

    public ResponseEntity<String> getResponse(){
        return response;
    }
}
