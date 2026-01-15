package com.asrmanalo.store;

import com.asrmanalo.store.entities.Address;
import com.asrmanalo.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var user = User.builder()
                    .id(1L)
                    .name("name")
                    .password("password")
                    .email("email")
                    .build();

        var address = Address.builder()
                    .id(1L)
                    .zip("12345")
                    .state("state")
                    .city("city")
                    .street("street")
                    .build();

        user.addAddress(address);
        System.out.println(user);
        System.out.println(address);
    }

}
