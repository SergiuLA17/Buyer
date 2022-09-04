package com.example.buyer.controller;

import com.example.buyer.models.request.CheckQuantityOfProductRequest;
import com.example.buyer.models.request.MultiProductRequest;
import com.example.buyer.models.request.RefundRequest;
import com.example.buyer.models.request.SingleProductRequest;
import com.example.buyer.service.BuyerService;
import com.example.buyer.service.url.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    BuyerService service;
    @Autowired
    private URLService url;


    @PostMapping("/buySingleProduct")
    @ResponseBody
    public ResponseEntity<?> buySingleProduct(@RequestBody(required = false) SingleProductRequest request) {
        return service.sendRequest(url.singleProductURL(), request);
    }

    @PostMapping("/buyMultipleProducts")
    @ResponseBody
    public ResponseEntity<?> buyMultipleProducts(@RequestBody(required = false) MultiProductRequest request) {
        return service.sendRequest(url.multiProductURL(), request);
    }

    @PostMapping("/checkProductQuantity")
    @ResponseBody
    public ResponseEntity<?> checkProductQuantity(@RequestBody(required = false) CheckQuantityOfProductRequest request) {
        return service.sendRequest(url.checkQuantityURL(), request);
    }

    @PostMapping("/refundProduct")
    @ResponseBody
    public ResponseEntity<?> returnProduct(@RequestBody(required = false) RefundRequest refund) {
        return service.sendRequest(url.refundProductURL(), refund);
    }
}

