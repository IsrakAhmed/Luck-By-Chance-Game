package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        /* game method starts the game */
        System.out.println("Welcome To Luck By Chance\n");
        game();     //Calling Method 1
    }

    //Method 1
    public static void game(){

        System.out.println("\nChoose Which Game You Wanna Play\n");
        System.out.println("1. Lottery Game");
        System.out.println("2. Find When Will You Get Married");

        gameDecider(); //Calling Method 2
    }


    //Method 2
    /* This method gameDecider gives the player options which game he wants to play */
    public static void gameDecider(){

        Scanner takingInput = new Scanner(System.in);

        int gameDecider = takingInput.nextInt();

        if(gameDecider == 1){
            lotteryGame();      //Calling Method 3
        }
        else if(gameDecider == 2){
            findWhenWillYouGetMarried();    //Calling Method 5
        }
        else{
            //This wil come on the screen if the value of the variable gameDecider is none of 1 or 2
            System.out.println("Wrong Input");
            System.out.println("Please Try Again");
            System.out.println("Select 1 or 2");

            gameDecider();  //Recursion of the Method gameDecider
        }
    }


    /************************** Game 1.Lottery Game **************************/

    //Start Game 1.Lottery Game

    //Method 3
    /* This method lotteryGame starts the lottery game*/
    public static void lotteryGame(){

        System.out.println("\nEnter Your Beautiful Name : ");

        int sizeOfPlayerName = playerName();      //Calling Method 8

        int randomNumber = randomNumberGenerator(sizeOfPlayerName,6);     //Calling Method 7

        String prize = prizeDecider(randomNumber);     //Calling Method 4

        //Output for Game 1
        System.out.print(" got ");
        System.out.println(prize);
        System.out.println("\nCongratulations!!!\n");

        playingAgain();       //Calling Method 10

    }

    //Method 4
    /* this method prizeDecider gets the prize based on the random number */
    public static String prizeDecider(int randomNumber){

        String [] listOfPrizes = {"","Covid Vaccine","Play Station 5","Mr Mango Candy","5 Taka","CGPA 4.00","Pizza"};

        String prize = listOfPrizes[randomNumber];

        return prize ;      //Returning to Method 3

    }

    //End Game 1.Lottery Game




    /************************** Game 2.Find When Will You Get Married **************************/

    //Start Game 2.Find When Will You Get Married

    //Method 5
    /* This method starts the Find When Will You Get Married game*/
    public static void findWhenWillYouGetMarried(){

        System.out.println("\nEnter Your Beautiful Name : ");

        int sizeOfPlayerName = playerName();       //Calling Method 8

        int randomNumber = randomNumberGenerator(sizeOfPlayerName,8);      //Calling Method 7

        dateDecider(randomNumber);      //Calling Method 6

    }

    //Method 6
    /* This method decides the date of marriage */
    public static void dateDecider(int randomNumber){

        String [] listOfMonths = {"","May","June","July","August","September","October","November","December"};

        String month = listOfMonths[randomNumber];

        double randomNumber2;
        int randomInt2 = 0;

        randomNumber2 = Math.random();

        randomNumber2 = randomNumber2 * 33;

        randomNumber2 = randomNumber2 + 1;

        randomInt2 = (int) randomNumber2;

        //Output for Game 2
        System.out.print(" Is Getting Married On ");
        System.out.print(randomInt2);
        System.out.print(" ");
        System.out.print(month);
        System.out.println(" 2021");
        System.out.println("\nCongratulations!!!\n");

        playingAgain();       //Calling Method 10

    }


    //End Game 2.Find When Will You Get Married


/////// Methods called for both games are down below

    //Method 7
    /* This method generates random number */
    public static int randomNumberGenerator(int sizeOfPlayerName, int range){

        double randomNumber;
        int randomInt=0;

        for(int i = 0; i < sizeOfPlayerName; i++ ){

            randomNumber = Math.random();

            randomNumber = randomNumber * range;

            randomNumber = randomNumber + 1;

            randomInt = (int) randomNumber;

        }

        return randomInt;       //Returning to Method 3 Or Method 5

    }

    //Method 8
    /* Taking player name as input */
    public static int playerName(){

        Scanner takingInput = new Scanner(System.in);
        String playerName = takingInput.nextLine();

        System.out.println("\n");
        System.out.print(playerName);

        int sizeOfPlayerName = sizeOfPlayerName(playerName);     //Calling Method 9

        return sizeOfPlayerName;        //Returning to Method 3 Or Method 5

    }

    //Method 9
    /* sizeOfPlayerName method counts how many characters are in playerName string */
    public static int sizeOfPlayerName(String playerName){

        int sizeOfPlayerName = playerName.length();

        int count = 0;

        //Counts each character except space
        for(int i = 0; i < sizeOfPlayerName; i++) {
            if(playerName.charAt(i) != ' ')
                count++;
        }

        return count;       //Returning to Method 8
    }

    //Method 10
    /* This Method playingAgain checks if the player wants to play again */
    public static void playingAgain(){

        System.out.println("Do You Wanna Play Again?");
        System.out.println("If No, Enter 0");
        System.out.println("If Yes, Enter 1");

        Scanner takingInput = new Scanner(System.in);

        int checkIfPlayingAgain = takingInput.nextInt();

        if(checkIfPlayingAgain == 0){
            System.out.println("\nThank You\n");
            System.exit(0);    //Exiting The Game
        }
        else if(checkIfPlayingAgain == 1){
            game();    //Calling Method 1
        }
        else{
            System.out.println("Wrong Input");
            System.out.println("Please Try Again");

            playingAgain();    //Recursion of the Method playingAgain
        }

    }






} /// End of class Main
