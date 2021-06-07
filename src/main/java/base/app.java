
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */
package base;

//At some point, you might have to deal with currency exchange rates, and you’ll need to ensure your calculations are as precise as possible.
//Write a program that converts currency. Specifically, convert euros to U.S. dollars. Prompt for the amount of money in euros you have, and prompt for the current exchange rate of the euro. Print out the new amount in U.S. dollars.
//The formula for currency conversion is derived from

//How many euros are you exchanging? 81
//What is the exchange rate? 1.3751
//81 euros at an exchange rate of 1.3751 is
//111.38 U.S. dollars

//Ensure that fractions of a cent are rounded up to the next penny.
//Use a single output statement.

import java.text.DecimalFormat;
import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many euros are you exchanging?");
        String euro = input.nextLine();
        System.out.println("What is the exchange rate?");
        String rate = input.nextLine();
        int b = Integer.parseInt(rate);
        int a = Integer.parseInt(euro);
        double usa = (b * a);
        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.println(euro + " euros at an exchange rate of " + rate + " is " + formatter.format(usa) + "U.S dollars.");
    }
}