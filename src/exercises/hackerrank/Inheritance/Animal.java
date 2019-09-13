package exercises.hackerrank.Inheritance;
// https://www.hackerrank.com/challenges/30-inheritance/tutorial
public class Animal {
    public int age;
    // Changing age to public will allow access to the other classes, without you have to use the getter.

    public Animal(int age){  //int age = parameter 713
        this.age=age;
        System.out.println("Animal created");

    }

    public void eat(){
        System.out.println("Animal eating");
    }

    public int getAge(){
        return age;
    }


    public static void main(String[] args){ //all written at 11:00
        //Animal a = new Animal(5);
        //Dog d = new Dog();
        Cat c = new Cat(9);
        c.meow();
        System.out.println();
        //d.run();
        //a.eat();
        //System.out.println(d.getAge());

    }
}
