package com.asrmanalo.store;

import com.asrmanalo.store.entities.Address;
import com.asrmanalo.store.entities.Profile;
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

        var profile = Profile.builder()
                .bio("bio").build();

        user.setProfile(profile);

        System.out.println(user);
        System.out.println("Profile belongs to: " + profile.getUser().getName());
    }

}
