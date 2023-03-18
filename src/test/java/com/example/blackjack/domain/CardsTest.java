package com.example.blackjack.domain;

import com.example.blackjack.domain.card.Card;
import com.example.blackjack.domain.card.Cards;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardsTest {

    @Test
    void 카드수_확인() {
        // When
        final List<Card> cards = Cards.shuffle();
        // Then
        assertEquals(52, cards.size());
    }
}
