package com.example.buyer.print;

import com.example.buyer.service.BuyerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

import java.net.ConnectException;
@Component
public class PrintInfoAboutResponse implements iPrintInfoAboutResponse {
    @Autowired
    BuyerService service;
    @Autowired
    iPrintInfoAboutRequest print;

    public void print(ResponseEntity<String> response){
        try {
            if (response.getStatusCode() == HttpStatus.OK) {
                print.print(Thread.currentThread().getName() + " got his product : " + service.getResponseFromMarket(response).get());
            } else {
                print.print(Thread.currentThread().getName() + " status product: product not found");
            }
        } catch (RestClientException e) {
            if (e.getCause() instanceof ConnectException) {
                print.print("Failed to connect to the market. Contact administrator.");
            }
        } catch (JsonProcessingException ignored) {
        }
    }
}
