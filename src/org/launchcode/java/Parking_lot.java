package org.launchcode.java;

import java.util.List;
import java.util.Random;

public class Parking_lot {
    public static List[][] spot = new List[2][5];
    public static Random rand = new Random();


//    public int park(){
//        int newcar = rand.nextInt(10);
//
//        return newcar;
//    }


    public static void main (String[] args) {
//        for (int i = 0; i < spot.length;i++){
//            for (int j = 0; j < spot[i].length;j++) {
//            }
//        }

        for (int i = 0; i < 10;i++) {
            int spots = rand.nextInt(10);
            int cg = rand.nextInt(3);
            if (cg > 0) {
                if (spots % 2==0){}
            }


        }




        System.out.println(spot[0][0]+"|"+ spot[0][1]+"|"+ spot[0][2]+"|"+ spot[0][3]+"|"+ spot[0][4]);
        System.out.println(spot[1][0]+"|"+ spot[1][1]+"|"+ spot[1][2]+"|"+ spot[1][3]+"|"+ spot[1][4]);
    }




}
