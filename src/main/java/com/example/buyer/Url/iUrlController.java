package com.example.buyer.Url;

import org.springframework.stereotype.Component;

@Component
public interface iUrlController {
    String useStorehouseUrl(String name, int quantity);
}
