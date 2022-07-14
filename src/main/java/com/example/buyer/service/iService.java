package com.example.buyer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface iService {
    ResponseEntity<String> sendRequestToMarket(String name, int quantity);

    Optional<JsonNode> getResponseFromMarket(ResponseEntity<String> response) throws JsonProcessingException;

    String getTheNameOfTheDesiredProducts();

    int getRandomNumber();
}
