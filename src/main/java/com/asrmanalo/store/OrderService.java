package com.asrmanalo.store;

public class OrderService {
    private PaymentService paymentService;

    public OrderService() {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
