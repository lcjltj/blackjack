package com.example.blackjack.domain.user;

import com.example.blackjack.domain.card.Card;

public interface Gamer {
    void addCard(final Card card);

    int calculate();

    void reset();
}
