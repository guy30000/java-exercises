package exercises.hackerrank.Inheritance;

public class Cat extends Animal {


    public Cat(int age){
        super(age);
        System.out.println("cat created");
        age++;
    }

    public void meow(){
        System.out.println("Cat meows");
    }

    public void prance(){
        System.out.println("Cat prances");
    }


}
