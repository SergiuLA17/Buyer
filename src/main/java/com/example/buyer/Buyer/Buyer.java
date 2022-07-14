package com.example.buyer.Buyer;

import com.example.buyer.print.Print;
import com.example.buyer.service.BuyerService;
import com.example.buyer.service.Response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Buyer extends Thread{
    @Autowired
    BuyerService service;
    @Autowired
    Response response;
    @Autowired
    Print info;


    @Override
    public void run() {

            info.print(Thread.currentThread().getName());
            response.create(service.sendRequestToMarket(service.getTheNameOfTheDesiredProducts(), service.getRandomNumber()));
            info.print(response.getResponse());

    }
}
