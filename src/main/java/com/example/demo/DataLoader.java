package com.example.demo;

import com.example.demo.model.Message;
import com.example.demo.model.User;
import com.example.demo.repo.MessageRepository;
import com.example.demo.repo.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final MessageRepository messageRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public DataLoader(
            MessageRepository messageRepository,
            UserRepository userRepository,
            PasswordEncoder passwordEncoder
    ) {
        this.messageRepository = messageRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        messageRepository.save(new Message("This is a public message", true));
        messageRepository.save(new Message("This is a private message", false));

        if (userRepository.findByUsername("user").isEmpty()) {
            User user = new User();
            user.setUsername("user");
            user.setPassword(passwordEncoder.encode("password"));
            userRepository.save(user);
        }

        System.out.println("=== Test data created ===");
    }
}
