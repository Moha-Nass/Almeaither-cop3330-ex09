package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println("Exercise 9 - Paint Calculator");
        System.out.print("How many square foot do you want to paint? ");
        Scanner in = new Scanner(System.in);
        int squarefoot = in.nextInt();
        int gallonrequired = (int)Math.ceil((float)squarefoot/(float)350);

        System.out.println("You will need to purchase "+ gallonrequired + " gallons of paint to cover "+squarefoot + " square feet.");

    }
}
