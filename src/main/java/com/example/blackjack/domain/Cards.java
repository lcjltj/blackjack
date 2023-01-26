package com.example.blackjack.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cards {
    private static final List<Card> cards = new ArrayList<>();

    static {
        for (Pattern pattern : Pattern.values()) {
            Arrays.stream(Number.values()).forEach(it -> cards.add(new Card(pattern, it)));
        }
    }

    private Cards() {
    }

    public static List<Card> getCards() {
        return Cards.cards;
    }

}
