package exercises.hackerrank.Exception.Interface.StarWarsInterfacePractice;

public class Enemy implements Character {
    public String weapon = "Lightsaber";

    public Enemy(){}

    public void attack() {
        System.out.println("The enemy attacks you");

    }

    public void heal(){
        System.out.println("The enemy heals himself");
    }

    public void weaponDraw(){

    }

    public String getWeapon(){
        return weapon;
    }
}

