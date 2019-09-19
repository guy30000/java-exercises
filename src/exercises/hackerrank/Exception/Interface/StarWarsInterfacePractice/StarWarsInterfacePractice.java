package exercises.hackerrank.Exception.Interface.StarWarsInterfacePractice;
import java.util.Random;


public class StarWarsInterfacePractice {



    public static Character summonCharacter(){
        Random rand = new Random();
        if (Math.abs(rand.nextInt()) % 2 == 0){
            return new Enemy();
        } else return  new Hero();

    }

    public static void main (String[] args){
        Enemy darthVader = new Enemy() ;
        Hero ObiWanKenobi = new Hero();
        darthVader.attack();
        ObiWanKenobi.attack();
        darthVader.heal();
        ObiWanKenobi.heal();
        System.out.println(darthVader.weapon);
        System.out.println(ObiWanKenobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();

    }
}
