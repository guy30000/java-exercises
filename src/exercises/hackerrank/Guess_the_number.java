package exercises.hackerrank;
import java.util.Random;
import java.util.Scanner;

public class Guess_the_number {
    private int theNumber;
    private int max;
    private int trys = 0;
    Scanner scanner = new Scanner(System.in);

    public Guess_the_number(){
        Random rand = new Random();
        setMax(100);
        setTheNumber(Math.abs(rand.nextInt()) % (getMax() + 1));
    }

    public void play() {

        while(true) {
            setTrys(getTrys()+1);
            int move = scanner.nextInt();
            if (move > getTheNumber()) {
                System.out.println("High");
            } else if (move < getTheNumber()) {
                System.out.println("Low");
            } else if (move == getTheNumber()) {
                System.out.println("Got it. Took you " + getTrys() + " trys.");
                break;
            }
        }
    }


public static void main(String[] args){
        Guess_the_number game = new Guess_the_number();
        System.out.println("Guess the num");
        game.play();
}


    public int getTheNumber() {
        return theNumber;
    }

    public void setTheNumber(int theNumber) {
        this.theNumber = theNumber;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getTrys() {
        return trys;
    }

    public void setTrys(int trys) {
        this.trys = trys;
    }
}
