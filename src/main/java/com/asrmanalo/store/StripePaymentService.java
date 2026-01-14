package com.asrmanalo.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stripe")
@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String stripeApiUrl;

    @Value("${stripe.enabled}")
    private boolean stripeEnabled;

    @Value("${stripe.timeout}")
    private int stripeTimeout;

    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies;

    @Override
    public void processPayment(double amount) {
        System.out.println("API Url: " + stripeApiUrl);
        System.out.println("Enabled: " + stripeEnabled);
        System.out.println("Timeout: " + stripeTimeout);
        System.out.println("Supported currencies: " + supportedCurrencies);

        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);
    }
}
