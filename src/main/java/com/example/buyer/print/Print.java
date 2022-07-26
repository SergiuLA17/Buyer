package com.example.buyer.print;

import com.example.buyer.print.Logger.MyLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class Print implements iPrint {
    @Autowired
    private MyLogger logger;

    public void printInfo(String name) {
        logger.request(name);
    }

    public void printInfo(ResponseEntity<String> response, String txt) {
        logger.response(response, txt);
    }

}
