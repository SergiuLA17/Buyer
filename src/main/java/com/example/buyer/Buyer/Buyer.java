package com.example.buyer.Buyer;

import com.example.buyer.print.Print;
import com.example.buyer.service.BuyerService;
import com.example.buyer.service.Response.ResponseController;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Buyer extends Thread{
    @Autowired
    private BuyerService service;
    @Autowired
    private ResponseController response;
    @Autowired
    private Print info;


    @Override
    public void run() {

            info.printInfo(Thread.currentThread().getName());
            response.create(service.sendRequestToMarket(service.getTheNameOfTheDesiredProducts(), service.getRandomNumber()));
        try {
            info.printInfo(response.getResponse(), String.valueOf(service.getResponseFromMarket(response.getResponse()).get()));
        } catch (JsonProcessingException ignored) {
        }

    }
}
