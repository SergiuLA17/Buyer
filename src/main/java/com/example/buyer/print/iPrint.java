package com.example.buyer.print;

import com.example.buyer.print.Logger.iLogger;
import org.springframework.http.ResponseEntity;

public interface iPrint {
    void printInfo(String txt);
    void printInfo(ResponseEntity<String> response,String txt);
}
