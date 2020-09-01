package com.rmit;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private Card[] cards;

    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    public void shuffle() {
        for (int i=0; i<cards.length-1; i++) {
            // choose a random number between i and length - 1
            // swap the ith card and the randomly-chosen card
            int x = randomInt(i, cards.length);
            swapCards(i, x);
        }
    }

    private static int randomInt(int low, int high) {
        // return a random number between low and high,
        // including both
        Random randomCard = new Random();
        return randomCard.nextInt(high-low) + (low);
    }
    private void swapCards(int i, int j) {
        // swap the ith and the jth cards in the array
        Card temp = this.cards[i];
        this.cards[i] = this.cards[j];
        this.cards[j] = temp;

    }



    public Card[] handCards(int start, int handSize) {
//        int end = start + handSize;
        Card[] hand = new Card[handSize];
        int i=start;
        for(int j=0; j<handSize; j++){
                hand[j] = this.cards[i];
                i++;
        }
        return hand;
    }

    public Card[] getCards() {
        return this.cards;

    }

    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }

    }

}
