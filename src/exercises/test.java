package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
/*
This is a test file used to dissect code found ont the web
 */
public class test {


        public static void main(String args[]){
            ArrayList<String> listofcountries = new ArrayList<String>();
            listofcountries.add("India");
            listofcountries.add("US");
            listofcountries.add("China");
            listofcountries.add("Denmark");

            /*Unsorted List*/
            System.out.println("Before Sorting:");
            for(String counter: listofcountries){
                System.out.println(counter);
            }

            /* Sort statement*/
            Collections.sort(listofcountries);

            /* Sorted List*/
            System.out.println("After Sorting:");
            for(String counter: listofcountries){
                System.out.println(counter);
            }
        }
    }




