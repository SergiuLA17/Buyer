package com.example.buyer.service.Request;

import com.example.buyer.exception.RestTemplateResponseErrorHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class CreateRestTemplate implements iRestTemplate{
    @Override
    public RestTemplate create() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setErrorHandler(new RestTemplateResponseErrorHandler());
        return restTemplate;
    }
}
