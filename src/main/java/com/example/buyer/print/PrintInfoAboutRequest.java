package com.example.buyer.print;

import com.example.buyer.print.Logger.iLogger;
import org.springframework.stereotype.Component;

@Component
public class PrintInfoAboutRequest implements iPrintInfoAboutRequest {
    iLogger logger;

    public PrintInfoAboutRequest(iLogger logger) {
        this.logger = logger;
    }

    @Override
    public void print(String name) {
        logger.logger().info(name + " has been sent a request to Market");;
    }
}
