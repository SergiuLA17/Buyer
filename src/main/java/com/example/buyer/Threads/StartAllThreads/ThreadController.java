package com.example.buyer.Threads.StartAllThreads;

import com.example.buyer.Buyer.Buyer;
import com.example.buyer.Threads.initOneThread.InitThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ThreadController implements iThreadController {
    @Autowired
    private Buyer buyer;
    @Autowired
    private InitThread initOneThread;

    @Override
    public void initThreads() {
        for (int i = 0; i < 99; i++) {
            initOneThread.start(i,buyer);
        }
    }
}
