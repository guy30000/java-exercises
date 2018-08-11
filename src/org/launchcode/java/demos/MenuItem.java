package org.launchcode.java.demos;

import java.util.ArrayList;
//This was copied from online

public class MenuItem
{
    private String myName;

    private double myPrice,
            myCost;

    private int    myCode;

    private boolean myAvailability;

    public MenuItem( String name, double price, double cost, int code, boolean available )
    {
        myName = name;
        myPrice = price;
        myCost = cost;
        myCode = code;
        myAvailability = available;
    }

    public String getName() { return myName; }
    public double getPrice() { return myPrice; }
    public double getCost() { return myCost; }
    public int getCode() { return myCode; }
    public boolean available() { return myAvailability; }


    public String menuString()
    {
        return getName() + " ($" + getPrice() + ")";
    }


    public static double roundMoney( double amount )
    {
        return (int)(100 * amount + 0.5) / 100.0;
    }

    public static String printAmount( double d )
    {
        String s = "" + d;
        int k = s.indexOf( "." );
        if ( k < 0 )
            return s + ".00";
        if ( k + 1 == s.length() )
            return s + "00";
        if ( k + 2 == s.length() )
            return s + "0";
        else
            return s;
    }

   // ***********************************************************************
    public static double[] Profits(ArrayList<MenuItem> items)
    {
        double[] profits = new double[items.size()];
        for (int i = 0; i < profits.length; i++)
        {
            profits[i] = roundMoney (items.get(i).getPrice() - items.get(i).getCost());
        }
        return profits;
    }
    //***********************************************************************
    public static void main( String[] args )
    {
        ArrayList<MenuItem> items1 = new ArrayList<MenuItem>();
        items1.add( new MenuItem("Stir Fry",5.43,0.45,1,true) );
        items1.add( new MenuItem("Nachos",3.49,0.15,0,false) );
        items1.add( new MenuItem("Mud Pie",6.50,1.25,2,true) );
        items1.add( new MenuItem("Jerk Chicken",8.99,3.20,1,false) );
        System.out.println(items1);



//        double[] t = profits( items1 );
//
//        for ( double d : t )
//            System.out.print( printAmount( d ) + " " );
    }
}