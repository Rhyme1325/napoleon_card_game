package com.rmit;

public class Card {
    private int rank;
    private int suit;

//    public static final String[] RANKS = {
//            null, "Ace", "2", "3", "4", "5", "6", "7",
//            "8", "9", "10", "Jack", "Queen", "King"};
//    public static final String[] SUITS = {
//            "Clubs", "Diamonds", "Hearts", "Spades"};

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public static void printDeck(Card[] cards) {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public String toString() {
        String[] ranks = {null, "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String s = ranks[this.rank] + " of " + suits[this.suit];
        return s;
    }

    public boolean equals(Card that) {
        return this.rank == that.rank
                && this.suit == that.suit;
    }

//    public boolean stronger(Card that){
//        if (this.rank < that.rank && that.suit == leadingSuit) {
//            return true;
////        } else if (that.suit == triumphSuit) {
////            return true;
//        }
//        return false;
//    }



    public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }

}
