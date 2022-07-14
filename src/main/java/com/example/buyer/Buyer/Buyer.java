package com.example.buyer.Buyer;


import com.example.buyer.controller.MainController;
import com.example.buyer.service.BuyerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import java.net.ConnectException;
import java.util.Random;

@Component
public class Buyer extends Thread {
    private BuyerService service;
    Logger logger = LoggerFactory.getLogger(MainController.class);

    public Buyer(BuyerService service){
        this.service = service;

    }

    @Override
    public void run() {

        ResponseEntity<String> response;
        try {
            response = service.sendRequestToMarket(service.getTheNameOfTheDesiredProducts(), 10 + (int) (Math.random() * 30));

                logger.info(Thread.currentThread().getName() + " got his product : " + service.getResponseFromMarket(response).get());

        } catch (JsonProcessingException ignored) {
            logger.info(Thread.currentThread().getName() + " status product: product not found");
        } catch (RestClientException e) {
            if (e.getCause() instanceof ConnectException) {
                logger.error("Failed to connect to the market. Contact administrator.");
            }
        }
    }
}
