/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "What is the order amount? " );
        double amnt = scnN.nextDouble();
        System.out.print( "What state do you live in? " );
        String st = scnN.next();
        double preTax = amnt;
        amnt = Math.ceil(amnt*10d)/10d;
        if(st.equals("Wisconsin")){
            double tax = preTax*0.05;
            try(Scanner scanner = new Scanner(System.in)) {
                System.out.print("What county do you live in? ");
                String cnty = scanner.nextLine();
                if (cnty.equals("Eau Claire")) {
                    double cntyTax = tax + 0.005;
                    tax = Math.ceil((cntyTax) * 100d) / 100d;
                    System.out.print("The tax is $" + String.format("%.2f", (Math.ceil(cntyTax * 100d) / 100d)) + "\n");
                } else if (cnty.equals("Dunn")) {
                    double cntyTax = tax + 0.004;
                    tax = Math.ceil(cntyTax * 100d) / 100d;
                    System.out.print("The tax is $" + String.format("%.2f", (Math.ceil(cntyTax * 100d) / 100d)) + "\n");
                } else {
                    System.out.print("The tax is $" + String.format("%.2f", tax) + "\n");
                }
                amnt = Math.ceil((tax + preTax) * 10d) / 10d;
            }
        }
        if(st.equals("Illinois")){
            double tax = preTax*0.08;
            System.out.print( "The tax is $"+ String.format("%.2f", tax) + "\n");
            amnt = Math.ceil((tax+preTax)*10d)/10d;
        }
        System.out.print("The total is $"+ String.format("%.2f", amnt));
    }
}