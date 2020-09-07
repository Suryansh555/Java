package com.company;

public class Main {

    public static void main(String[] args) {

        int ret = CalculateHighScorePosition(1500) ;
        int ret1 = CalculateHighScorePosition(900) ;
        int ret2 = CalculateHighScorePosition(400) ;
        int ret3 = CalculateHighScorePosition(50) ;
        displayHighScorePosition("SURYANSH",ret);
        displayHighScorePosition("UNNATI",ret1);
        displayHighScorePosition("AKAASH",ret2);
        displayHighScorePosition("SAHIL",ret3);




    }
    public static void displayHighScorePosition(String Name, int Rank){
        System.out.println(Name + " managed to get into position " + Rank + " on the High Score Table");
    }
    public static int CalculateHighScorePosition(int Score){
        if (Score > 1000){
            return 1;
        }
        if (Score > 500 && Score < 1000){
            return 2 ;
        }
        if (Score >100 && Score < 500){
            return 3 ;
        }
        else {
            return 4 ;
        }
    }
}
