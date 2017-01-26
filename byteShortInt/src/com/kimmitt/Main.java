package com.kimmitt;

public class Main {

    public static void main(String[] args) {
        // write your code here
       int highScorePosition = calcHighScorePos(1500);
       displayHighScorePosition("Patrick", highScorePosition);

       calculateScore("Patrick", 500);
        calcFeetAndInchesToCent(10, 10);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        //System.out.println(playerName + " manager to get into position " + highScorePosition + " on the high score table");
    }

    public static int calcHighScorePos(int playerScore){
        if(playerScore > 1000){
            return 1;
        }else if(playerScore > 500 && playerScore < 1000){
            return 2;
        } else if(playerScore > 100 && playerScore < 500){
            return 3;
        } else {
            return 4;
        }
    }


    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("unknown Player " + " scored " + score + " points");
        return score * 1000;
    }



    public static double calcFeetAndInchesToCent(double feet, double inches){
        if(feet < 0 || (inches > 12 || inches < 0)){
            return -1;
        }

        double cent = (feet * 12) * 2.54;
        cent += inches * 2.54;
        System.out.println(feet + " feet ");
        return cent;
    }

    public static double calcFeetAndInchesToCent(double inches){
        if(inches < 0){
            return -1;
        }
    }
}
