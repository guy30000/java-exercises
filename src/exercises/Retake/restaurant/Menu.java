package exercises.Retake.restaurant;

//Moved this project to Resturant2

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static int selectionV;
    private static Scanner inV;
    public String run = "true";

    //public ArrayList<menu> items;




    public static void main(String[] args) {


        do {

            System.out.println("--Menu--\n");
            System.out.println("1. View Menu");
            System.out.println("2. View Item");
            System.out.println("3. Add item");
            System.out.println("4. Exit\n");
            inV = new Scanner(System.in);
            selectionV = inV.nextInt();

            if (selectionV < 1 || selectionV > 4) {
                System.out.println("*Invalid selection*\n");
                continue;
//                inV = new Scanner(System.in);
//                selectionV = inV.nextInt();
            }
            if (selectionV == 1) {
                System.out.println("one -" + selectionV);
            }
            if (selectionV == 2) {
                System.out.println("2 -" + selectionV);
            }
            if (selectionV == 3) {
                System.out.println("3 -" + selectionV);
            }
            if (selectionV == 4) {   //done
                System.exit(0);
            }



        } while (inV !=null);
    }
}
