package com.example.buyer.print.Logger;

import com.example.buyer.controller.MainController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggerInit implements iLogger {


    @Override
    public Logger logger() {
        return LoggerFactory.getLogger(MainController.class);
    }
}
