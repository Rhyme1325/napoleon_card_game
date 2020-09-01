package com.rmit;

public class  Team {
    private boolean isATeam;
    private Player teamPlayer1;
    private Player teamPlayer2;
    private int score;
    private int bid;

    public Team(boolean isATeamPlayer, Player teamPlayer1, Player teamPlayer2) {
        this.isATeam = isATeamPlayer;
        this.teamPlayer1 = teamPlayer1;
        this.teamPlayer2 = teamPlayer2;
        this.score = 0;
        this.bid = 4;
    }

    public boolean isATeam() {
        return isATeam;
    }

    public Player getTeamPlayer1() {
        return teamPlayer1;
    }

    public Player getTeamPlayer2() {
        return teamPlayer2;
    }

    public int getScore() {
        return score;
    }

    public int getBid() {
        return bid;
    }

    public void setTeamPlayer1(Player teamPlayer1) {
        this.teamPlayer1 = teamPlayer1;
    }

    public void setTeamPlayer2(Player teamPlayer2) {
        this.teamPlayer2 = teamPlayer2;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }
}
