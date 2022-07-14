package com.example.buyer.service;

import com.example.buyer.print.Print;
import com.example.buyer.Url.Url;
import com.example.buyer.service.RandomNameOfProduct.ArrayController;
import com.example.buyer.service.RandomNumber.RandomNumber;
import com.example.buyer.service.Request.CreateRestTemplate;
import com.example.buyer.service.Request.Request;
import com.example.buyer.service.Response.ResponseBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuyerService implements iService {
    @Autowired
    Request sendRequestToMarket;
    @Lazy
    @Autowired
    Print print;
    @Autowired
    CreateRestTemplate createRestTemplate;
    @Autowired
    Url url;
    @Autowired
    ResponseBody responseFromMarket;
    @Autowired
    ArrayController arrayOfNamesOfProducts;
    @Autowired
    RandomNumber randomNumber;

    public ResponseEntity<String> sendRequestToMarket(String name, int quantity) {
        return sendRequestToMarket.send(url.useStorehouseUrl(name, quantity), createRestTemplate.create());
    }

    public Optional<JsonNode> getResponseFromMarket(ResponseEntity<String> response) throws JsonProcessingException {
        return responseFromMarket.get(response);
    }

    public String getTheNameOfTheDesiredProducts() {
        return arrayOfNamesOfProducts.get();
    }

    public int getRandomNumber(){ return randomNumber.get();
    }

}
