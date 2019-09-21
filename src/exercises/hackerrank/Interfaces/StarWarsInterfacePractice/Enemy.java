package exercises.hackerrank.Interfaces.StarWarsInterfacePractice;

import java.util.Random;

public class Enemy implements Character {
    public String weapon = "Lightsaber";
    public int health =  1000;
    Random rand = new Random();

    public Enemy(){}

    public void attack() {
        System.out.println("The enemy attacks you");


    }

    public void heal(){

        int heal = rand.nextInt(50+ 1);
        health+=heal;
        System.out.println("Enemy heals " + heal + "  Current health " + health);

    }

    public void injured(){
        int Hit = rand.nextInt( 100+ 1);
        health-=Hit;
        System.out.println("Enemy health " + health);
    }

    public void weaponDraw(){
    }




    public String getWeapon(){
        return weapon;
    }
}

