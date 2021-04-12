package com.Italia.deck;

public class Power {
    private int rankPower;
    private String rankName;

    public Power(int rankPower) {
        if(rankPower>=2 && rankPower<=14){
            this.rankPower = rankPower;
            if(rankPower==11){
                this.rankName = "Jack";
            }else if(rankPower==12){
                this.rankName = "Queen";
            }else if(rankPower==13){
                this.rankName = "King";
            }else if(rankPower==14){
                this.rankName = "Ace";
            }else {
                this.rankName = String.valueOf(rankPower);
            }
        }
    }

    public int getRankPower() {
        return rankPower;
    }

    public void setRankPower(int rankPower) {
        this.rankPower = rankPower;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }


    @Override
    public String toString() {
        return "Power{" +
                rankName + '\'' +
                '}';
    }
}
