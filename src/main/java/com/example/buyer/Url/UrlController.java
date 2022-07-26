package com.example.buyer.Url;

import org.springframework.stereotype.Component;

@Component
public class UrlController implements iUrlController{
    @Override
    public String useStorehouseUrl(String name, int quantity) {
        return "http://localhost:8080/getProductFromStorehouse?name=" +name+"&quantity="+quantity;
    }
}
