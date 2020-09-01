package com.rmit;

public class Player {
    private String name;
//    private String partner;
    private int bid;
    private Card[] firstFive;
    private Card[] lastEight;
    private Card[] fullHand;

    public Player(String name, Card[] firstFive) {
        this.name = name;
//        this.partner = null;
        this.bid = 4;
        this.firstFive = firstFive;
        this.lastEight = null;
        this.fullHand = null;
    }

    public void printFullHand() {
        for (Card fullHand : this.fullHand) {
            System.out.println(fullHand);
        }

    }

    public void printLastEight() {
        for (Card lastFive : this.lastEight) {
            System.out.println(lastEight);
        }

    }

    public void printFirstFive() {
        for (Card firstFive : this.firstFive) {
            System.out.println(firstFive);
        }

    }

    public String getName() {
        return name;
    }

    public Card[] getFullHand() {
        return fullHand;
    }

//    public String getPartner() {
//        return partner;
//    }

    public int getBid() {
        return bid;
    }

    public Card[] getFirstFive() {
        return firstFive;
    }

    public Card[] getLastEight() {
        return lastEight;
    }

//    public void setPartner(String partner) {
//        this.partner = partner;
//    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void setLastEight(Card[] lastEight) {
        this.lastEight = lastEight;
    }

    public void setFullHand(Card[] fullHand) {
        this.fullHand = fullHand;
    }
}
