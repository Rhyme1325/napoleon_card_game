package com.rmit;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // write your code here
        newGame();
        Deck deck = new Deck();
        deck.shuffle();
        deck.print();

        Player[] players = getPlayers(deck);

        Team[] teams = getTeams(players);

        startBidding(players, teams);

        System.out.println("Final bids are : " + teams[0].getBid() + " for 1st & for 2nd: " + teams[1].getBid());

        lastEight(deck, players);

        for(int i=0; i<players.length; i++){
            System.out.println(Arrays.toString(players[i].getFirstFive()) + Arrays.toString(players[i].getLastEight()));
        }

//        fullHand(deck, players);
//
//        System.out.println("final hand!");
//        for(int i=0; i<players.length; i++){
//            players[i].printFullHand();
//        }
    }

//    public static void fullHand(Deck deck, Player[] players){
//        Card[] fullHand = new Card[13];
//        Card[] first5 = new Card[5];
//        Card[] last8 = new Card[8];
//        for(int i=0; i<first5.length; i++){
//            fullHand[i] = first5[i];
//        }
//
//        int j=5;
//        for(int i=0; i<last8.length; i++){
//            fullHand[j] = last8[i];
//            j++;
//        }
//
//        for(int i=0; i<players.length; i++){
//            //for(int j=0; j<fullHand.length; j++){
//                players[i].setFullHand(fullHand);
//            //}
//        }
//    }

    public static void lastEight(Deck deck, Player[] players){
        int i=20;
        for(int j=0; j<players.length; j++){
            System.out.println("Handing out remaining 8 cards....");
            players[j].setLastEight(deck.handCards(i, 8));
            //System.out.println(players[j].getName());
            players[j].printLastEight();
            i += 8;
        }
    }

    public static void printCurrentBids(int i, Team[] teams){
        if(teams[i].isATeam()){
            System.out.println("Team A is bidding for = " + teams[i].getBid());
        } else if(!teams[i].isATeam()){
            System.out.println("Team B is bidding for = " + teams[i].getBid());
        }
    }

    public static void invalidBid(){ System.out.println("Bidding for 5 or 6 is not allowed. Please Start bidding at 7 to 12 to score; 4 if you choose to pass."); }

    public static void startBidding(Player[] players, Team[] teams){
        System.out.println("Start bidding at 7 to 12 to score; 4 if you choose to pass!");
        boolean keepBidding = true;
        int bid;
        do {
            int i=0;
            for(int j=0; j< players.length; j++){
                do {
                    System.out.println(players[j].getName() + " from Team X place your bid: ");
                    bid = scanner.nextInt();
                    if(bid == 5 || bid == 6){ invalidBid(); }
                    teams[i].setBid(bid);
                    scanner.nextLine();
                } while(bid < teams[i].getBid() || bid == 5 || bid == 6);

                printCurrentBids(i, teams);

                if(teams[0].getBid() >= 13 || teams[1].getBid() >= 13){
                    keepBidding=false;
                    System.out.println("Max bidding reached! Bidding for more than 12 is not allowed. Please Start bidding at 7 to 12 to score; 4 if you choose to pass.");
                } else if (bid == teams[i].getBid()) { keepBidding=false; }
                i++;
                if(i==2){ i=0; }
            }
        } while(keepBidding);
    }

    public static Team[] getTeams(Player[] players){
        Team[] teams = new Team[2];
        int i=0, j=2;
        boolean aOrB=true;
        for(int k=0; k<teams.length; k++){
            if(k==1){
                aOrB=false;
            }
            teams[k] = new Team(aOrB ,players[i], players[j]);
            System.out.println("Team " + (k+1) + " consists of : " + teams[k].getTeamPlayer1().getName() + " & " + teams[k].getTeamPlayer2().getName());
            i ++;
            j ++;
        }
        return teams;
    }

    public static Player[] getPlayers(Deck deck){
        Player[] players = new Player[4];
        int i=0;
        for(int j=0; j<players.length; j++){
            System.out.println("Enter name for Player :" );
            players[j] = new Player(/*scanner.nextLine()*/"testingxx", deck.handCards(i, 5));
            //System.out.println(players[j].getName());
            players[j].printFirstFive();
            i += 5;
        }
        return players;
    }

    public static void newGame(){
        System.out.println("Welcome to Italian Bridge");//System.out.println("Press Enter to start a new game:");scanner.nextLine();
        System.out.println("Starting a new game of Italian Bridge");
        System.out.println("Shuffling");//deck.print();
        System.out.println("Starting new game with a random deck");
    }
}
