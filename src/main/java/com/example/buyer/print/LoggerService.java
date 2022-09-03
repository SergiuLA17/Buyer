package com.example.buyer.print;

import com.example.buyer.exception.RestTemplateResponseErrorHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class LoggerService implements iLoggerService {
    private final Logger logger = LoggerFactory.getLogger(RestTemplateResponseErrorHandler.class);

    public void info(String text) {
        logger.info(text);
    }

    public void info(ResponseEntity<?> response) {
        logger.info("Product received. " + Objects.requireNonNull(response.getBody()));
    }

}
