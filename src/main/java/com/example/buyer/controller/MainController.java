package com.example.buyer.controller;

import com.example.buyer.Threads.StartAllThreads.StartAllthreads;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    StartAllthreads startAllthreads;

    @GetMapping("/buyProduct")
    public String buyProduct() {

        startAllthreads.initThreads();

        return "getProduct";
    }
}

