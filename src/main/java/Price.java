/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Ratchford
 */

import java.util.Scanner;
public class Price {
    public static void main(String[] args)
    {
        // Declares our variables

        int item;
        double total;
        double subTotal;
        double tax = 0.055;
        int quantity;

        Scanner scan = new Scanner(System.in);
        // user enters the price of an item

        System.out.print(" Enter the  price of item 1");
        item =  scan.nextInt();
        // User enters quantity of item
        System.out.print(" Enter th total quantity of the item 1");
        quantity =  scan.nextInt();

        System.out.print(" Enter the  price of item 2");
        item =  scan.nextInt();

        System.out.print(" Enter th total quantity of the item 2");
        quantity =  scan.nextInt();

        System.out.print(" Enter the  price of item 3");
        item =  scan.nextInt();

        System.out.print(" Enter th total quantity of the item 3");
        quantity =  scan.nextInt();
        // This function creates the equations

        total = item * quantity;
        subTotal = total;
        tax = tax * item;


        // prints our result
        
        System.out.println(item  + " : " + quantity);
        System.out.println(" Subtotal: " + subTotal);
        System.out.println(" Tax: " + tax);








        }
    }

