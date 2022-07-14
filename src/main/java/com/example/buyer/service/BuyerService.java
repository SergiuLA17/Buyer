package com.example.buyer.service;

import com.example.buyer.controller.MainController;
import com.example.buyer.exception.RestTemplateResponseErrorHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class BuyerService {
    private final Logger logger = LoggerFactory.getLogger(MainController.class);
    public ResponseEntity<String> sendRequestToMarket(String name, int quantity) {
        String url = "http://localhost:8080/getProductFromStorehouse?name=" +name+"&quantity="+quantity;
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setErrorHandler(new RestTemplateResponseErrorHandler());

        try {
            return restTemplate.getForEntity(url, String.class);
        } catch (RestClientException e) {
            logger.error("Error" + e);
            return restTemplate.getForEntity(url, String.class);
        }
    }


    public Optional <JsonNode> getResponseFromMarket(ResponseEntity<String> response) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        return Optional.of(mapper.readTree(response.getBody()));
    }

    public String getTheNameOfTheDesiredProducts() {
        ArrayList<String> nameOfDesireProducts = new ArrayList<>();
        nameOfDesireProducts.add("Potato");
        nameOfDesireProducts.add("Salt");
        nameOfDesireProducts.add("Sugar");
        nameOfDesireProducts.add("Apple");
        nameOfDesireProducts.add("Banana");
        nameOfDesireProducts.add("Kiwi");
        nameOfDesireProducts.add("Carrot");
        nameOfDesireProducts.add("Mango");
        nameOfDesireProducts.add("Orange");
        nameOfDesireProducts.add("Pear");
        nameOfDesireProducts.add("Peach");

        return nameOfDesireProducts.get((int) (Math.random() * nameOfDesireProducts.size()));
    }


}
