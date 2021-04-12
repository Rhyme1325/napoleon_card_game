package com.Italia.deck;

import java.util.HashMap;

public class Card {
    private Power power;
    private Suit suit;

    public Card(Power power, Suit suit) {
        this.power = power;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                 power.getRankName() +
                " of " + suit.getSuitName() +
                '}';
    }

    //    private int rank;
//    private int suit;
//    public Card(int rank, int suit) {
//        this.rank = rank;
//        this.suit = suit;
//    }








//    public static void printDeck(Card[] cards) {
//        for (Card card : cards) {
//            System.out.println(card);
//        }
//    }
//
//    public String toString() {
//        String[] ranks = {null, "2", "3", "4", "5", "6",
//                "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
//        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
//        String s = ranks[this.rank] + " of " + suits[this.suit];
//        return s;
//    }
//
//    public boolean equals(Card that) {
//        return this.rank == that.rank
//                && this.suit == that.suit;
//    }
//
//
//
//
//
//    public int compareTo(Card that) {
//        if (this.suit < that.suit) {
//            return -1;
//        }
//        if (this.suit > that.suit) {
//            return 1;
//        }
//        if (this.rank < that.rank) {
//            return -1;
//        }
//        if (this.rank > that.rank) {
//            return 1;
//        }
//        return 0;
//    }

}
