package exercises.hackerrank.Inheritance;
// https://www.hackerrank.com/challenges/30-inheritance/tutorial
//https://www.hackerrank.com/challenges/30-abstract-classes/tutorial
public abstract class  Animal {
    public int age;
    // Changing age to public will allow access to the other classes, without you have to use the getter.

    public Animal(int age){  //int age = parameter 713
        this.age=age;
        System.out.println("Animal created");

    }

    public abstract void eat();

    public int getAge(){
        return age;
    }

    public void sleep() {
        System.out.println("An animal is sleeping");  //800 2
    }

    public static void main(String[] args){ //all written at 11:00
        //Animal a = new Animal(5); //nologer working on 2nd
        Dog d = new Dog();
        Cat c = new Cat(9);
        c.meow();
        System.out.println();
        //d.run();
        //a.eat();
        d.eat();
        //System.out.println(d.getAge());

        //casting 1200 2
        Object dog = new Dog();
        Dog realDog = (Dog) dog;

        Object str =  "est"; //1444 2
        String reals = (String) str;

        Dog doggy = new Dog();  //1600 2
        if (d instanceof Animal){
            Animal animal = (Animal) doggy;
            animal.sleep();
        }
        doggy.sleep();






    }
}
