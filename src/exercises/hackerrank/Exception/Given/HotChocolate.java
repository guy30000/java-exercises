package exercises.hackerrank.Exception.Given;
//https://www.youtube.com/watch?v=9TuoE16Tlac  Exceptions p2
//creat custom exception

import java.util.concurrent.TimeUnit;

public class HotChocolate {
    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException, TooColdException{
        if (cocoaTemp>= tooHot) {
            throw  new TooHotException();
        } else if (cocoaTemp<= tooCold) {
            throw  new TooColdException();
        }
    }

    public static void main(String[] args) throws InterruptedException{  //1700 info about what happens you dont have the try/catches
        double currentCocoaTemp=150;        //the InterruptException is part of the TimeUnit command

        boolean wrongTemp = true;
        while (wrongTemp) {
            try {
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("Good");
                wrongTemp=false;
            } catch (TooHotException e1) {
                System.out.println("Too Hot");
                currentCocoaTemp = currentCocoaTemp -5;
            } catch (TooColdException e2) {
                System.out.println("Too Cold");
                currentCocoaTemp = currentCocoaTemp +5;
            }
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("annnnd ITs GONE!");

    }



}
