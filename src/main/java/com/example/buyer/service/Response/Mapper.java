package com.example.buyer.service.Response;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class Mapper implements iMapper{
    @Override
    public ObjectMapper create() {
        return new ObjectMapper();
    }
}
