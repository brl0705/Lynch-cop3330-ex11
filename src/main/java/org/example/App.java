package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input1 = new Scanner(System.in);
        System.out.println("How many euros are you exchanging?");
        double euros = input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("What is the exchange rate?");
        double rate =input2.nextDouble();

        double us=euros*rate;

        System.out.println(euros + " euros at an exchange rate of " + rate + " is " + us + " U.S. dollars.");
    }
}
