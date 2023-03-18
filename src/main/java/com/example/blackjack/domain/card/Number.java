package com.example.blackjack.domain.card;

import java.util.Arrays;

public enum Number {
    ACE(new int[]{1, 11}),
    TWO(new int[]{2}),
    THREE(new int[]{3}),
    FOUR(new int[]{4}),
    FIVE(new int[]{5}),
    SIX(new int[]{6}),
    SEVEN(new int[]{7}),
    EIGHT(new int[]{8}),
    NINE(new int[]{9}),
    TEN(new int[]{10}),
    JACK(new int[]{10}),
    QUEEN(new int[]{10}),
    KING(new int[]{10});

    private int[] score;

    Number(final int[] score) {
        this.score = score;
    }

    public int[] getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Number{" +
                "score=" + Arrays.toString(score) +
                '}';
    }
}
