package com.example.buyer.service;

import com.example.buyer.print.LoggerService;
import com.example.buyer.service.url.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BuyerService implements iBuyerService {
    @Autowired
    private RequestService requestService;
    @Autowired
    private LoggerService logger;

    public ResponseEntity<?> sendRequest(String url, Object object) {
        requestService.sendRequest(url, object);
        logger.info(requestService.getResponse());
        return requestService.getResponse();
    }
}
