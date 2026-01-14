package com.asrmanalo.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    private final NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void register(User user) {
        try {
            userRepository.save(user);

            notificationService.send("User registration confirmed!", user.getEmail());
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
