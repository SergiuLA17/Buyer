package com.example.buyer.print.Logger;

import com.example.buyer.controller.MainController;
import com.example.buyer.service.BuyerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

import java.net.ConnectException;

@Component
public class MyLogger implements iLogger {
    private final Logger logger;

    public MyLogger() {
        this.logger = LoggerFactory.getLogger(MainController.class);;
    }

    public void request(String text){
        logger.info(text + "send a request!");
    }

    public void response(ResponseEntity<String> response, String product){
        try {
            if (response.getStatusCode() == HttpStatus.OK) {
                logger.info(Thread.currentThread().getName() + " got his product : " + product);
            } else {
                logger.error(Thread.currentThread().getName() + " status product: product not found");
            }
        } catch (RestClientException e) {
            if (e.getCause() instanceof ConnectException) {
                logger.error("Failed to connect to the market. Contact administrator.");
            }
        }
    }

}
