package com.example.buyer.print.Logger;

import org.springframework.http.ResponseEntity;

public interface iLogger {
    void request(String text);
    void response(ResponseEntity<String> response,String txt);
}
