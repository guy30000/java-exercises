package exercises.hackerrank.Inheritance;

public class Dog extends Animal{

    public Dog(){ //800
        super(15); //This calls animal.
        System.out.println("Created Dog");
    }

    public void eat(){
        System.out.println("a dog is eating ");  //500 2
    }

    //public abstract eat();  500 2


    public void sleep(){
        System.out.println("A dog is sleeping");
    }


 public void ruff(){
     System.out.println("Sig sats ruff");
 }

public void run(){
    System.out.println("A Dog is running");
}

}
