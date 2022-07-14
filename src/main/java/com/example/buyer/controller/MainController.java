package com.example.buyer.controller;

import com.example.buyer.Buyer.Buyer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    Buyer buyer;
    Logger logger = LoggerFactory.getLogger(MainController.class);
    @GetMapping("/buyProduct")
    public String buyProduct() {
        for (int i = 0; i < 99; i++) {

            Thread buyerThread = new Thread(buyer);
            buyerThread.setName("Buyer " + i);
            buyerThread.start();
            logger.info(buyerThread.getName() + " has been sent a request to Market");

        }
        return "getProduct";
    }
}

