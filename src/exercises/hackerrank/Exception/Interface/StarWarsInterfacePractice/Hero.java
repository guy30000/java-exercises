package exercises.hackerrank.Exception.Interface.StarWarsInterfacePractice;
//https://www.youtube.com/watch?v=YTx_JRBkcD4
public class Hero implements Character {
public String weapon = "lightsaber";

    public Hero(){}

    @Override
    public void attack() {
        System.out.println("Hero attackts the enemy");
    }

    @Override
    public void heal() {
        System.out.println("Hero heals you");
    }

    public String getWeapon(){
        return weapon;
    }
}
