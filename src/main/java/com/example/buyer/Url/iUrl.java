package com.example.buyer.Url;

import org.springframework.stereotype.Component;

@Component
public interface iUrl {
    String useStorehouseUrl(String name, int quantity);
}
