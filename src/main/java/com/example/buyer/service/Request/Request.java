package com.example.buyer.service.Request;

import com.example.buyer.print.Print;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class Request implements iRequest{
    @Lazy
    @Autowired
    Print info;
    @Override
    public ResponseEntity<String> send(String url, RestTemplate restTemplate){
        try {
            return restTemplate.getForEntity(url,String.class);
        } catch (RestClientException e) {
            info.print("Error" + e);
            return restTemplate.getForEntity(url,String.class);
        }
    }

}
