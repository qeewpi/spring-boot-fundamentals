package com.asrmanalo.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {
    private PaymentService paymentService;

//    @PostConstruct
//    public void init() {
//        System.out.println("OrderService PostConstruct");
//    }
//
//    @PreDestroy
//    public void cleanUp() {
//        System.out.println("OrderService PreDestroy");
//    }

    public OrderService(PaymentService paymentService) {
        System.out.println("OrderService Created");
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }
}
