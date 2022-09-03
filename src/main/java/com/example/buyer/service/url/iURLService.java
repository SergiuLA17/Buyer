package com.example.buyer.service.url;

import org.springframework.stereotype.Component;

@Component
public interface iURLService {
    String buySingleProduct(String name, int quantity);
}
