package exercises.hackerrank.Interfaces.StarWarsInterfacePractice;
import java.util.Random;


public class StarWarsInterfacePractice {



    public static Character summonCharacter(){
        Random rand = new Random();
        if (Math.abs(rand.nextInt()) % 2 == 0){
            return new Enemy();
        } else return  new Hero();
    }

    public void fight(){



    }



    public static void main (String[] args){
        Enemy darthVader = new Enemy() ;
        Hero ObiWanKenobi = new Hero();
//        darthVader.attack();
//        ObiWanKenobi.attack();
//        darthVader.heal();
//        ObiWanKenobi.heal();
//        System.out.println(darthVader.weapon);
//        System.out.println(ObiWanKenobi.getWeapon());
//        Character spy = summonCharacter();
//        spy.attack();
//        spy.heal();
        Random rand = new Random();
        for (int i = 0;i<20;i++){

            int turn = rand.nextInt( 6);

            if (turn == 0 || turn == 4){

                ObiWanKenobi.attack();
                darthVader.injured();
            } else if (turn ==2){
                ObiWanKenobi.heal();
            } else if (turn ==3 || turn == 5){
                darthVader.attack();
                ObiWanKenobi.injured();
            } else if (turn ==1){
                darthVader.heal();
            }

        }

    }
}
