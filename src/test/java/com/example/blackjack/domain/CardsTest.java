package com.example.blackjack.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardsTest {

    @Test
    void 카드수_확인() {
        // When
        final List<Card> cards = Cards.getCards();
        // Then
        assertEquals(52, cards.size());
    }
}
