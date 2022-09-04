package com.example.buyer.service.url;

import org.springframework.stereotype.Component;

@Component
public class URLService {
    public String singleProductURL() {
        return "http://localhost:8080/buySingleProduct";
    }

    public String multiProductURL() {
        return "http://localhost:8080/buyMultipleProducts";
    }

    public String checkQuantityURL() {
        return "http://localhost:8080/checkProductQuantity";
    }

    public String refundProductURL() {
        return "http://localhost:8080/refundProduct";
    }

}
