package com.example.blackjack.application;

import com.example.blackjack.domain.Game;
import com.example.blackjack.domain.user.Player;
import com.example.blackjack.ui.Input;

public class BlackjackService {


    public void start() {
        final Game game = new Game();
        game.addPlayer(new Player(1000L));

        for (Player player : game.getPlayers()) {
            player.batting(Input.batting());
        }

        game.start();
        System.out.println("딜러 카드: " + game.getDealer().getCards().get(0));

        while (!game.isEnded()) {
            game.getPlayers()
                    .stream()
                    .filter(Player::isContinued)
                    .forEach(it -> {
                        it.getCards().forEach(System.out::println);
                        it.checkContinued(Input.isContinued());
                    });
            game.addPlayersCard();
        }

        game.continueDealerCard();

        System.out.println("딜러: " + game.getDealer().calculate());
        System.out.println(game.getDealer().getCards());
        game.getPlayers().forEach(it -> System.out.println("유저: " + it.calculate()));
        game.getPlayers().forEach(it -> System.out.println(it.getCards()));
    }
}
