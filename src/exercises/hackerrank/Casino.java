package exercises.hackerrank;

import java.util.Random;
import java.util.Scanner;

public class Casino {
    private int balance;
    Random rand = new Random();
    Scanner in = new Scanner(System.in);

    public Casino() {
        balance = 10000000;
    }

    public void play() {
        System.out.println("Select a game\n" + getBalance() + "\n1. Roulette");
        int gameChoice = in.nextInt();
        gameSelection(gameChoice);

    }

    public void gameSelection(int choice) {
        if (choice == 1) {
            roulette();
        } else {
            System.out.println("invalid choice");

        }
    }


    // // Games
    public void roulette() {
        int betAmount;
        int winnings = 0;
        boolean win ;
        String rb;//red/bule
        String eo="odd";//even/odd

        while (true) {
            System.out.println("How much will you bet? Your balances is: " + getBalance());
            betAmount = in.nextInt();
            if (betAmount < getBalance()) {
                break;
            } else {
                System.out.println("You don't have that much");
            }
        }
        //The spin
        System.out.println("place your bet. Enter 0-37\n0-35 (x35)\n36=Even 37=Odd (x2)");
        int betBoard = in.nextInt();
        int winNum = rand.nextInt(36);
        if (winNum % 2 ==0){
            eo="even";
        }
        //results
        System.out.println("Winner is " + winNum + " " + eo);
        if (betBoard==winNum){
            win=(true);
            winnings = betAmount*35;
            setBalance(getBalance()+ winnings);
        } else if ((betBoard==36 && winNum % 2==0) ||(betBoard==37 && winNum % 2==1)){
            win=(true);
            winnings = betAmount*2;
            setBalance(getBalance() + winnings);
        } else { win=(false);
            setBalance(getBalance() - betAmount);
        }

        if (win==(true)) {
            System.out.println("You Win! " + winnings);
        } else {
            System.out.println("You lose :( " + betAmount);
        }

        ///Replay?
        System.out.println("Would you like to play again? Enter 1 for yes, 2 for main menu, anything else to exit");
        int playAgain = in.nextInt();
        if (playAgain==1){
            roulette();
        } else if (playAgain==2){
            play();
        }



    }


    public static void main(String[] args) {
        Casino game = new Casino();
        game.play();

    }


// // //g&S

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
