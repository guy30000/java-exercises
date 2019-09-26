package exercises.hackerrank.Review.tictactoeapplication;

import java.util.Scanner; ///stopped video at 3500

public class TicTacTowApplication {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            System.out.println("Play some stinking tac tac toe\n Pick what you want to be which char you want to be and what I will be");
        System.out.println();
            System.out.println("Enter a single char to rep you on the board");
            char playerToken = sc.next().charAt(0);
            System.out.println("Enter a single char to rep your opponent");
            char opponentTOken = sc.next().charAt(0);
            TicTacToe game = new TicTacToe(playerToken,opponentTOken);
            AI ai = new AI();
        }
    }
}
