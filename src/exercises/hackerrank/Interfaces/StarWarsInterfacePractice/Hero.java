package exercises.hackerrank.Interfaces.StarWarsInterfacePractice;

import java.util.Random;

//https://www.youtube.com/watch?v=YTx_JRBkcD4
public class Hero implements Character {
public String weapon = "lightsaber";
    public int health =  1000;
    Random rand = new Random();

    public Hero(){}

    @Override
    public void attack() {
        System.out.println("Hero atacks the enemy");
    }

    @Override
    public void heal() {
        int heal = rand.nextInt( 50 + 1);
        health+=heal;
        System.out.println("Hero heals " + heal + "  Current health " + health);
    }

    public void injured(){
        int Hit = rand.nextInt(100 + 1);
        health-=Hit;
        System.out.println("Hero health " + health);
    }

    public String getWeapon(){
        return weapon;
    }
}
