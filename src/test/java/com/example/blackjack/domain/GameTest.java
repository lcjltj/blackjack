package com.example.blackjack.domain;

import com.example.blackjack.application.BlackjackService;
import com.example.blackjack.domain.user.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {

    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
        game.addPlayer(new Player(1000L));
    }

    @Test
    void 블랙잭_시작() {
        // when
        BlackjackService blackjackService = new BlackjackService();
        blackjackService.start();
    }


}
