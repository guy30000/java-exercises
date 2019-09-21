package org.launchcode.java;

import java.util.List;

public class Change {
    public static int total = 1017;
    public static int given = 1200;
    public static int change = given-total;
    public static int[] changeCoin = new int[5];
    public static int[] cName = new int[5];


    public static void main (String[] args) {

        int currentCoin = 0;
        String cName="";
        while (change > 0) {
            for (int i =0;i<changeCoin.length;i++){
                if (i==0)currentCoin=100;
                if (i==1)currentCoin=25;
                if (i==2)currentCoin=10;
                if (i==3)currentCoin=5;
                if (i==4)currentCoin=1;
                int amtOfCCoin = change / currentCoin;
                change -=  (currentCoin*amtOfCCoin);
                changeCoin[i]=amtOfCCoin;
                System.out.print(cName + changeCoin[i]+" ");
            }


        }
    }






}
