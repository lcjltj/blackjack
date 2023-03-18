package com.example.blackjack.domain;

import com.example.blackjack.domain.card.Card;
import com.example.blackjack.domain.card.Number;
import com.example.blackjack.domain.card.Pattern;
import com.example.blackjack.domain.user.Player;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PlayerTest {

    @Test
    @DisplayName("배팅 금액 부족 오류")
    void throwBattingMoney() {
        // Given
        final Player player = new Player(1000L);
        // Then
        assertThrows(IllegalArgumentException.class, () -> player.batting(2000L));
    }

    @Test
    @DisplayName("카드 추가")
    void addCard() {
        // Given
        final Player player = new Player(1000L);
        // When
        player.addCard(new Card(Pattern.HART, Number.ACE));
        final List<Card> cards = player.getCards();
        // Then
        assertThat(cards).hasSize(1);
        assertThat(cards.get(0)).isEqualTo(new Card(Pattern.HART, Number.ACE));

    }

    @Test
    @DisplayName("카드 합계 게산")
    void calculate() {
        // Given
        final Player player = new Player(1000L);
        player.addCard(new Card(Pattern.HART, Number.ACE));
        player.addCard(new Card(Pattern.HART, Number.TEN));

        final Player player2 = new Player(1000L);
        player2.addCard(new Card(Pattern.HART, Number.ACE));
        player2.addCard(new Card(Pattern.HART, Number.TWO));
        player2.addCard(new Card(Pattern.HART, Number.TEN));

        // Then
        assertThat(player.calculate()).isEqualTo(21);
        assertThat(player2.calculate()).isEqualTo(13);
    }

    @Test
    @DisplayName("카드 초기화")
    void reset() {
        // Given
        final Player player = new Player(1000L);
        player.addCard(new Card(Pattern.HART, Number.ACE));
        final List<Card> cards = player.getCards();
        // When
        player.reset();
        // Then
        assertThat(player.getCards()).hasSize(0);
    }
}
