package exercises.hackerrank.Inheritance;

public class Dog extends Animal{

    public Dog(){ //800
        super(15); //This calls animal.
        System.out.println("Created Dog");
    }

 public void ruff(){
     System.out.println("Sig sats ruff");
 }

public void run(){
    System.out.println("A Dog is running");
}

}
