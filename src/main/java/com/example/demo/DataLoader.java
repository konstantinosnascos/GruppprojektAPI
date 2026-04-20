package com.example.demo;

import com.example.demo.model.Message;
import com.example.demo.repo.MessageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final MessageRepository repo;

    public DataLoader(MessageRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {
        repo.save(new Message("This is a public message", true));
        repo.save(new Message("This is a private message", false));

        System.out.println("=== Test data created ===");
    }
}
