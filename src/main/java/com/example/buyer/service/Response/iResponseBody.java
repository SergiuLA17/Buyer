package com.example.buyer.service.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface iResponseBody {
    Optional<JsonNode> get(ResponseEntity<String> response) throws JsonProcessingException;
}
