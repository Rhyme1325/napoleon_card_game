package com.Italia.deck;

import com.Italia.deck.Card;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards = new ArrayList<Card>();

    public Deck(){
        for(int power=2; power<=14; power++){
            cards.add(new Card(new Power(power), new Suit("Spades")));
        }

        for(int power=2; power<=14; power++){
            cards.add(new Card(new Power(power), new Suit("Hearts")));
        }

        for(int power=2; power<=14; power++){
            cards.add(new Card(new Power(power), new Suit("Clubs")));
        }

        for(int power=2; power<=14; power++){
            cards.add(new Card(new Power(power), new Suit("Diamonds")));
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
        Card temp = cards.get(i);
        cards.set(i,cards.get(j));
        cards.set(j, temp);

    }

    public void shuffle() {
        for (int i=0; i<cards.size()-1; i++) {
            // choose a random number between i and length - 1
            // swap the ith card and the randomly-chosen card
            int x = randomInt(i, cards.size());
            swapCards(i, x);
        }
    }





    public Card[] handCards(int start, int handSize) {
//        int end = start + handSize;
        Card[] hand = new Card[handSize];
        for(int j=0; j<handSize; j++){
                hand[j] = this.cards.get(start);
                start++;
        }
        return hand;
    }

    public ArrayList<Card> getCards() {
        return this.cards;

    }

    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }

    }

}
