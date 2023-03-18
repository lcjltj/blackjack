package com.example.blackjack;

import com.example.blackjack.application.BlackjackService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlackjackApplication {

    public static void main(String[] args) {
//        SpringApplication.run(BlackjackApplication.class, args);
        BlackjackService blackjackService = new BlackjackService();
        blackjackService.start();
    }

}
