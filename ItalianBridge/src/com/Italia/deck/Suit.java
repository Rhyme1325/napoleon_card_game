package com.Italia.deck;

public class Suit {
    private String suitName;
    private static boolean isTriumph;

    public Suit(String suitName) {
        this.suitName = suitName;

    }

    public String getSuitName() {
        return suitName;
    }

    public void setSuitName(String suitName) {
        this.suitName = suitName;
    }

    public static boolean isIsTriumph() {
        return isTriumph;
    }

    public static void setIsTriumph(boolean isTriumph) {
        Suit.isTriumph = isTriumph;
    }
}
