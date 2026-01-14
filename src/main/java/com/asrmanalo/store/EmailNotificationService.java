package com.asrmanalo.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {
    @Value("${mail.host}")
    private String host;

    @Value("${mail.port}")
    private int port;

    @Override
    public void send(String message, String  recipientEmail) {
        System.out.println("Message: " + message);
        System.out.println("Recipient email: " + recipientEmail);
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);

    }
}

